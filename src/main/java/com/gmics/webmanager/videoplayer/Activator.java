/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer;

import java.util.Hashtable;

import nl.gx.product.onlinehelp.helpprovider.OnlineHelpProvider;
import nl.gx.webmanager.authorization.AuthorizationService;
import nl.gx.webmanager.authorization.impl.PermissionCategoryImpl;
import nl.gx.webmanager.authorization.impl.PermissionImpl;
import nl.gx.webmanager.cms.element.Element;
import nl.gx.webmanager.wcb.Component;
import nl.gx.webmanager.wcb.ComponentBundleDefinition;
import nl.gx.webmanager.wcb.ComponentDefinition;
import nl.gx.webmanager.wcb.ComponentDependency;
import nl.gx.webmanager.wcb.elementtype.ElementComponent;
import nl.gx.webmanager.wcb.elementtype.ElementComponentType;
import nl.gx.webmanager.wcb.elementtype.impl.ElementComponentDefinitionImpl;
import nl.gx.webmanager.wcb.foundation.ComponentBundleActivatorBase;
import nl.gx.webmanager.wcb.foundation.ComponentBundleDefinitionImpl;
import nl.gx.webmanager.wcb.foundation.ComponentDependencyImpl;
import nl.gx.webmanager.wcb.presentationtype.PresentationComponent;
import nl.gx.webmanager.wcb.presentationtype.PresentationComponentType;
import nl.gx.webmanager.wcb.presentationtype.impl.PresentationComponentDefinitionImpl;
import nl.gx.webmanager.wcb.presentationtype.impl.SimplePresentationComponent;
import nl.gx.webmanager.wcb.servicetype.ServiceComponentType;
import nl.gx.webmanager.wcb.servicetype.impl.ServiceComponentDefinitionImpl;

import com.gmics.webmanager.videoplayer.api.RBACConstants;
import com.gmics.webmanager.videoplayer.api.VideoPlayerElement;
import com.gmics.webmanager.videoplayer.api.WCBConstants;
import com.gmics.webmanager.videoplayer.element.VideoPlayerElementComponent;
import com.gmics.webmanager.videoplayer.element.VideoPlayerElementController;
import com.gmics.webmanager.videoplayer.element.VideoPlayerElementImpl;
import com.gmics.webmanager.videoplayer.onlinehelp.OnlineHelpProviderImpl;

/**
 * Activator class of the element WCB. This class defines the component definitions and is responsible for instantiating
 * the WCB and its components. It registers a VideoPlayer element {@link VideoPlayerElement} and the Online Help
 * Provider service.
 */
public class Activator extends ComponentBundleActivatorBase {
    /**
     * Creates the RBAC permissions and RBAC category for the VideoPlayer element.
     * @param definition The element component definition to create the permissions for
     * @param categoryId The ID of the RBAC category to create.
     * @param createPermissionId ID of create element permission.
     * @param updatePermissionId ID of update element permission.
     * @param deletePermissionId ID of delete element permission.
     * @param clazz the element class.
     */
    public void createElementPermissions(ElementComponentDefinitionImpl definition, String categoryId,
            String createPermissionId, String updatePermissionId, String deletePermissionId,
            Class<? extends Element> clazz) {
        // Create the paragraph permission category
        PermissionCategoryImpl category = new PermissionCategoryImpl();
        category.setValue(categoryId);
        category.setLabelId(categoryId);
        category.setShowAsComponent(true);

        // Assosiate the permission category with the element definition
        definition.setPermissionCategory(category);

        // Create the RBAC permissions
        PermissionImpl createPermission = new PermissionImpl(createPermissionId, createPermissionId, category);
        PermissionImpl updatePermission = new PermissionImpl(updatePermissionId, updatePermissionId, category);
        PermissionImpl deletePermission = new PermissionImpl(deletePermissionId, deletePermissionId, category);

        // Set the default permissions for each permission group
        PermissionImpl[] noPermissions = new PermissionImpl[]{};
        PermissionImpl[] allPermissions = new PermissionImpl[]{createPermission, updatePermission, deletePermission};
        definition.setPermissionsForPermissionGroup(nl.gx.webmanager.wcb.WCBConstants.CASUAL_USER_PERMISSION_GROUP,
                noPermissions);
        definition.setPermissionsForPermissionGroup(nl.gx.webmanager.wcb.WCBConstants.EDITOR_PERMISSION_GROUP,
                allPermissions);
        definition.setPermissionsForPermissionGroup(nl.gx.webmanager.wcb.WCBConstants.MAIN_EDITOR_PERMISSION_GROUP,
                allPermissions);
        definition.setPermissionsForPermissionGroup(
                nl.gx.webmanager.wcb.WCBConstants.APPLICATION_MANAGER_PERMISSION_GROUP, allPermissions);
        definition.setPermissionsForPermissionGroup(nl.gx.webmanager.wcb.WCBConstants.DEVELOPER_PERMISSION_GROUP,
                allPermissions);

        // Set the create an delete permissions on the element component
        definition.setCreatePermissions(clazz, new PermissionImpl[]{createPermission});
        definition.setDeletePermissions(clazz, new PermissionImpl[]{deletePermission});

        // Associate the permission category with the element definition
        definition.setPermissionCategory(category);
    }

    /**
     * Creates and returns the bundle definition of the WebManager component bundle.
     * @return the bundle definition of the WebManager component bundle
     */
    @Override
    protected ComponentBundleDefinition getBundleDefinition() {
        ComponentBundleDefinitionImpl componentBundleDefinition = new ComponentBundleDefinitionImpl();
        componentBundleDefinition.setId(WCBConstants.BUNDLE_ID);
        componentBundleDefinition.setWCBKey("14c2c120c928863b2646c4ea4b7c4dda");
        componentBundleDefinition.setName(WCBConstants.BUNDLE_NAME);
        componentBundleDefinition.setNameSpace(WCBConstants.NAMESPACE_URI);
        componentBundleDefinition.setDescription(WCBConstants.BUNDLE_DESCRIPTION);
        componentBundleDefinition.setComponentDefinitions(getComponentDefinitions());
        return componentBundleDefinition;
    }

    /**
     * Returns an array of component definitions of this bundle.
     * @return Array of component definitions of this bundle
     */
    private ComponentDefinition[] getComponentDefinitions() {
        ComponentDefinition[] componentDefinitions =
                {getElementComponentDefinition(), getPresentationComponentDefinition(),
                        getOnlineHelpProviderServiceComponentDefinition()};
        return componentDefinitions;
    }

    /**
     * Returns the component definition for the element component.
     * @return The component definition for the element component
     */
    protected ComponentDefinition getElementComponentDefinition() {
        ElementComponentDefinitionImpl definition =
                new ElementComponentDefinitionImpl(false, VideoPlayerElementImpl.class);
        definition.setId(WCBConstants.ELEMENT_COMPONENT_ID);
        definition.setName(WCBConstants.ELEMENT_COMPONENT_NAME);
        definition.setDescription(WCBConstants.ELEMENT_COMPONENT_DESCRIPTION);
        definition.setTypeId(ElementComponentType.class.getName());
        definition.setProperties(new Hashtable<String, String>());
        definition.setImplementationClassName(VideoPlayerElementComponent.class.getName());
        String[] componentInterfaces = {Component.class.getName(), ElementComponent.class.getName()};
        definition.setInterfaceClassNames(componentInterfaces);
        definition.setWrapperClassNames(new String[]{VideoPlayerElementImpl.class.getName()});
        definition.setControllerClassName(VideoPlayerElementController.class.getName());

        // Element specific methods
        definition.setMenuTextMessageKey("element.menutitle");
        definition.setTargetMenuLocationAfter("wysiwyg");
        definition.setAccessKey('v');
        definition.setPresentationScope("VideoPlayerElement_videoplayer");
        definition.setSmallIcon("smallVideoPlayerElementIcon.gif");
        definition.setLargeIcon("largeVideoPlayerElementIcon.gif");

        // Create the permission category and permissions
        String categoryId = RBACConstants.ELEMENT_CATEGORY;
        String createPermissionId = RBACConstants.CREATE_ELEMENT;
        String updatePermissionId = RBACConstants.UPDATE_ELEMENT;
        String deletePermissionId = RBACConstants.DELETE_ELEMENT;
        createElementPermissions(definition, categoryId, createPermissionId, updatePermissionId, deletePermissionId,
                VideoPlayerElement.class);

        // Create a dependency with the authorization service to check authorization
        ComponentDependencyImpl authorizationServiceDependency = new ComponentDependencyImpl();
        authorizationServiceDependency.setServiceName(AuthorizationService.class.getName());
        authorizationServiceDependency.setRequired(true);

        // Set component dependencies
        definition.setDependencies(new ComponentDependency[]{authorizationServiceDependency});

        return definition;
    }

    /**
     * Provides the online help provider service component definition.
     * @return online help provider service component definition
     */
    private ComponentDefinition getOnlineHelpProviderServiceComponentDefinition() {
        ServiceComponentDefinitionImpl definition = new ServiceComponentDefinitionImpl(false);
        definition.setId(WCBConstants.HELPPROVIDER_COMPONENT_ID);
        definition.setName(WCBConstants.HELPPROVIDER_COMPONENT_NAME);
        definition.setDescription(WCBConstants.HELPPROVIDER_COMPONENT_DESCRIPTION);
        definition.setTypeId(ServiceComponentType.class.getName());
        definition.setProperties(new Hashtable<String, String>());
        definition.setImplementationClassName(OnlineHelpProviderImpl.class.getName());
        definition.setInterfaceClassNames(new String[]{OnlineHelpProvider.class.getName()});
        definition.setDependencies(new ComponentDependency[0]);

        return definition;
    }

    /**
     * Returns the component definition for the presentation component.
     * @return The component definition for the presentation component
     */
    protected ComponentDefinition getPresentationComponentDefinition() {
        PresentationComponentDefinitionImpl definition = new PresentationComponentDefinitionImpl(false);
        definition.setId(WCBConstants.PRESENTATION_COMPONENT_ID);
        definition.setName(WCBConstants.PRESENTATION_COMPONENT_NAME);
        definition.setDescription(WCBConstants.PRESENTATION_COMPONENT_DESCRIPTION);
        definition.setTypeId(PresentationComponentType.class.getName());
        definition.setProperties(new Hashtable<String, String>());
        definition.setImplementationClassName(SimplePresentationComponent.class.getName());
        definition.setInterfaceClassNames(new String[]{PresentationComponent.class.getName()});
        definition.setDependencies(new ComponentDependency[]{});
        definition.setWrapperClassNames(new String[]{});

        return definition;
    }
}
