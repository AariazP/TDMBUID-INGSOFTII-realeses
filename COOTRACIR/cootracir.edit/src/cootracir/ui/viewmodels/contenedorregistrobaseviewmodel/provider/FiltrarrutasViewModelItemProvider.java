/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.provider;


import cootracir.provider.ModelEditPlugin;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel;

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
 * This is the item provider adapter for a {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FiltrarrutasViewModelItemProvider 
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
	public FiltrarrutasViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModelPropertyDescriptor(object);
			addTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModelPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the The Contenedor Registro Base View Model Filtrarrutas View Model Filtrarrutas View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FiltrarrutasViewModel_theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FiltrarrutasViewModel_theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel_feature", "_UI_FiltrarrutasViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Contenedor Registro Base View Modelselected Filtrarrutas View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FiltrarrutasViewModel_theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FiltrarrutasViewModel_theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel_feature", "_UI_FiltrarrutasViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FiltrarrutasViewModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FiltrarrutasViewModel_name_feature", "_UI_FiltrarrutasViewModel_type"),
				 ContenedorregistrobaseviewmodelPackage.Literals.FILTRARRUTAS_VIEW_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FiltrarrutasViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FiltrarrutasViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FiltrarrutasViewModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FiltrarrutasViewModel_type") :
			getString("_UI_FiltrarrutasViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(FiltrarrutasViewModel.class)) {
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__NAME:
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
