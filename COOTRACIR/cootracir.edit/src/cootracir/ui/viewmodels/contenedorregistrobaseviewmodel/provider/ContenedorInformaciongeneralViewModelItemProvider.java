/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.provider;


import cootracir.provider.ModelEditPlugin;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;

import cootracir.ui.viewmodels.provider.ViewModelItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorInformaciongeneralViewModelItemProvider extends ViewModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformaciongeneralViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addNombrePropertyDescriptor(object);
			addHoraPropertyDescriptor(object);
			addRutaPropertyDescriptor(object);
			addFechaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorInformaciongeneralViewModel_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorInformaciongeneralViewModel_nombre_feature", "_UI_ContenedorInformaciongeneralViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hora feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoraPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorInformaciongeneralViewModel_hora_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorInformaciongeneralViewModel_hora_feature", "_UI_ContenedorInformaciongeneralViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ruta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRutaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorInformaciongeneralViewModel_ruta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorInformaciongeneralViewModel_ruta_feature", "_UI_ContenedorInformaciongeneralViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorInformaciongeneralViewModel_fecha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorInformaciongeneralViewModel_fecha_feature", "_UI_ContenedorInformaciongeneralViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ContenedorInformaciongeneralViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorInformaciongeneralViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorInformaciongeneralViewModel)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorInformaciongeneralViewModel_type") :
			getString("_UI_ContenedorInformaciongeneralViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContenedorInformaciongeneralViewModel.class)) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
