/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.provider;


import cootracir.provider.ModelEditPlugin;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistrosViewModelItemProvider 
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
	public RegistrosViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addTheContenedorRegistroBaseViewModelselectedRegistrosViewModelPropertyDescriptor(object);
			addTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModelPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addHoraPropertyDescriptor(object);
			addEstadoPropertyDescriptor(object);
			addIncidenciaPropertyDescriptor(object);
			addLugarPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the The Contenedor Registro Base View Modelselected Registros View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorRegistroBaseViewModelselectedRegistrosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegistrosViewModel_theContenedorRegistroBaseViewModelselectedRegistrosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegistrosViewModel_theContenedorRegistroBaseViewModelselectedRegistrosViewModel_feature", "_UI_RegistrosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Contenedor Registro Base View Model Registros View Model Registros View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegistrosViewModel_theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegistrosViewModel_theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel_feature", "_UI_RegistrosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_RegistrosViewModel_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegistrosViewModel_id_feature", "_UI_RegistrosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__ID,
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
				 getString("_UI_RegistrosViewModel_hora_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegistrosViewModel_hora_feature", "_UI_RegistrosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__HORA,
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
				 getString("_UI_RegistrosViewModel_estado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegistrosViewModel_estado_feature", "_UI_RegistrosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__ESTADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidencia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidenciaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegistrosViewModel_incidencia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegistrosViewModel_incidencia_feature", "_UI_RegistrosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__INCIDENCIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lugar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLugarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegistrosViewModel_lugar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegistrosViewModel_lugar_feature", "_UI_RegistrosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__LUGAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RegistrosViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RegistrosViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RegistrosViewModel)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RegistrosViewModel_type") :
			getString("_UI_RegistrosViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(RegistrosViewModel.class)) {
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ID:
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__HORA:
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ESTADO:
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__INCIDENCIA:
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__LUGAR:
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
