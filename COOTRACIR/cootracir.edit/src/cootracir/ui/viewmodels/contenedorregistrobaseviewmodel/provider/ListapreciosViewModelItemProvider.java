/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.provider;


import cootracir.provider.ModelEditPlugin;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel;

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
 * This is the item provider adapter for a {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListapreciosViewModelItemProvider 
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
	public ListapreciosViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addTheContenedorRegistroBaseViewModelselectedListapreciosViewModelPropertyDescriptor(object);
			addTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModelPropertyDescriptor(object);
			addRuta1PropertyDescriptor(object);
			addRuta2PropertyDescriptor(object);
			addPecioPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the The Contenedor Registro Base View Modelselected Listaprecios View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorRegistroBaseViewModelselectedListapreciosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListapreciosViewModel_theContenedorRegistroBaseViewModelselectedListapreciosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListapreciosViewModel_theContenedorRegistroBaseViewModelselectedListapreciosViewModel_feature", "_UI_ListapreciosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Contenedor Registro Base View Model Listaprecios View Model Listaprecios View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListapreciosViewModel_theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListapreciosViewModel_theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel_feature", "_UI_ListapreciosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ruta1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuta1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListapreciosViewModel_ruta1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListapreciosViewModel_ruta1_feature", "_UI_ListapreciosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL__RUTA1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ruta2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuta2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListapreciosViewModel_ruta2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListapreciosViewModel_ruta2_feature", "_UI_ListapreciosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL__RUTA2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pecio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPecioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListapreciosViewModel_pecio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListapreciosViewModel_pecio_feature", "_UI_ListapreciosViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL__PECIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ListapreciosViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListapreciosViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ListapreciosViewModel)object).getRuta1();
		return label == null || label.length() == 0 ?
			getString("_UI_ListapreciosViewModel_type") :
			getString("_UI_ListapreciosViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ListapreciosViewModel.class)) {
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA1:
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA2:
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__PECIO:
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
