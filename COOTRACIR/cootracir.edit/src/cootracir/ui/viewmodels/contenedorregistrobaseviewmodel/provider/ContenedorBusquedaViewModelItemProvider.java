/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.provider;


import cootracir.provider.ModelEditPlugin;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel;
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
 * This is the item provider adapter for a {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorBusquedaViewModelItemProvider extends ViewModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addTxtNombredelconductorViewModelPropertyDescriptor(object);
			addTxtRutadelconductorViewModelPropertyDescriptor(object);
			addNombredelconductorViewModelPropertyDescriptor(object);
			addSelectedNombredelconductorViewModelPropertyDescriptor(object);
			addRutadelconductorViewModelPropertyDescriptor(object);
			addSelectedRutadelconductorViewModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Txt Nombredelconductor View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTxtNombredelconductorViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorBusquedaViewModel_txtNombredelconductorViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorBusquedaViewModel_txtNombredelconductorViewModel_feature", "_UI_ContenedorBusquedaViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Txt Rutadelconductor View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTxtRutadelconductorViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorBusquedaViewModel_txtRutadelconductorViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorBusquedaViewModel_txtRutadelconductorViewModel_feature", "_UI_ContenedorBusquedaViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombredelconductor View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombredelconductorViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorBusquedaViewModel_nombredelconductorViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorBusquedaViewModel_nombredelconductorViewModel_feature", "_UI_ContenedorBusquedaViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Nombredelconductor View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedNombredelconductorViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorBusquedaViewModel_selectedNombredelconductorViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorBusquedaViewModel_selectedNombredelconductorViewModel_feature", "_UI_ContenedorBusquedaViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rutadelconductor View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRutadelconductorViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorBusquedaViewModel_rutadelconductorViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorBusquedaViewModel_rutadelconductorViewModel_feature", "_UI_ContenedorBusquedaViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Rutadelconductor View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedRutadelconductorViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorBusquedaViewModel_selectedRutadelconductorViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorBusquedaViewModel_selectedRutadelconductorViewModel_feature", "_UI_ContenedorBusquedaViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL,
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
			childrenFeatures.add(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL);
			childrenFeatures.add(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL);
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
	 * This returns ContenedorBusquedaViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorBusquedaViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorBusquedaViewModel)object).getTxtNombredelconductorViewModel();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorBusquedaViewModel_type") :
			getString("_UI_ContenedorBusquedaViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContenedorBusquedaViewModel.class)) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL:
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL:
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
				(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL,
				 ContenedorregistrobaseviewmodelFactory.eINSTANCE.createNombredelconductorViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL,
				 ContenedorregistrobaseviewmodelFactory.eINSTANCE.createRutadelconductorViewModel()));
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
