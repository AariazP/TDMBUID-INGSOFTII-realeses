/**
 */
package cootracir.domain.provider;


import cootracir.domain.DomainFactory;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionInventario;

import cootracir.provider.ModelEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cootracir.domain.FactoryGestionInventario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryGestionInventarioItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionInventarioItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addEstadoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FactoryGestionInventario_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FactoryGestionInventario_id_feature", "_UI_FactoryGestionInventario_type"),
				 DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FactoryGestionInventario_estado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FactoryGestionInventario_estado_feature", "_UI_FactoryGestionInventario_type"),
				 DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__ESTADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_BUSES);
			childrenFeatures.add(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO);
			childrenFeatures.add(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES);
			childrenFeatures.add(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR);
			childrenFeatures.add(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_RUTA);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FactoryGestionInventario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FactoryGestionInventario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FactoryGestionInventario)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_FactoryGestionInventario_type") :
			getString("_UI_FactoryGestionInventario_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FactoryGestionInventario.class)) {
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ID:
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ESTADO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES:
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO:
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES:
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR:
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_BUSES,
				 DomainFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO,
				 DomainFactory.eINSTANCE.createDetalleRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES,
				 DomainFactory.eINSTANCE.createLiquidacion()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR,
				 DomainFactory.eINSTANCE.createRegistrador()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.FACTORY_GESTION_INVENTARIO__LST_RUTA,
				 DomainFactory.eINSTANCE.createRuta()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}
