/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.provider;


import cootracir.provider.ModelEditPlugin;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelFactory;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;

import cootracir.ui.viewmodels.provider.ViewModelItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorRegistroBaseViewModelItemProvider extends ViewModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addNotificacionPropertyDescriptor(object);
			addTxtFiltrarrutasViewModelPropertyDescriptor(object);
			addFiltrarrutasViewModelPropertyDescriptor(object);
			addSelectedFiltrarrutasViewModelPropertyDescriptor(object);
			addSelectedRegistrosViewModelPropertyDescriptor(object);
			addRegistrosViewModelPropertyDescriptor(object);
			addSelectedListapreciosViewModelPropertyDescriptor(object);
			addListapreciosViewModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Notificacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotificacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorRegistroBaseViewModel_notificacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorRegistroBaseViewModel_notificacion_feature", "_UI_ContenedorRegistroBaseViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Txt Filtrarrutas View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTxtFiltrarrutasViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorRegistroBaseViewModel_txtFiltrarrutasViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorRegistroBaseViewModel_txtFiltrarrutasViewModel_feature", "_UI_ContenedorRegistroBaseViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filtrarrutas View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltrarrutasViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorRegistroBaseViewModel_filtrarrutasViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorRegistroBaseViewModel_filtrarrutasViewModel_feature", "_UI_ContenedorRegistroBaseViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Filtrarrutas View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedFiltrarrutasViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorRegistroBaseViewModel_selectedFiltrarrutasViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorRegistroBaseViewModel_selectedFiltrarrutasViewModel_feature", "_UI_ContenedorRegistroBaseViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Registros View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedRegistrosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorRegistroBaseViewModel_selectedRegistrosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorRegistroBaseViewModel_selectedRegistrosViewModel_feature", "_UI_ContenedorRegistroBaseViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Registros View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistrosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorRegistroBaseViewModel_registrosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorRegistroBaseViewModel_registrosViewModel_feature", "_UI_ContenedorRegistroBaseViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Listaprecios View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedListapreciosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorRegistroBaseViewModel_selectedListapreciosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorRegistroBaseViewModel_selectedListapreciosViewModel_feature", "_UI_ContenedorRegistroBaseViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Listaprecios View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListapreciosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorRegistroBaseViewModel_listapreciosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorRegistroBaseViewModel_listapreciosViewModel_feature", "_UI_ContenedorRegistroBaseViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL);
			childrenFeatures.add(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL);
			childrenFeatures.add(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA);
			childrenFeatures.add(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL);
			childrenFeatures.add(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL);
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
	 * This returns ContenedorRegistroBaseViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorRegistroBaseViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorRegistroBaseViewModel)object).getNotificacion();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorRegistroBaseViewModel_type") :
			getString("_UI_ContenedorRegistroBaseViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContenedorRegistroBaseViewModel.class)) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL:
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
				(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL,
				 ContenedorregistrobaseviewmodelFactory.eINSTANCE.createFiltrarrutasViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL,
				 ContenedorregistrobaseviewmodelFactory.eINSTANCE.createContenedorInformaciongeneralViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA,
				 ContenedorregistrobaseviewmodelFactory.eINSTANCE.createContenedorBusquedaViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL,
				 ContenedorregistrobaseviewmodelFactory.eINSTANCE.createRegistrosViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL,
				 ContenedorregistrobaseviewmodelFactory.eINSTANCE.createListapreciosViewModel()));
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
