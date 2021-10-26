/**
 */
package FeatureIDEXSD.provider;


import FeatureIDEXSD.ExtendedFeatureModelType;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link FeatureIDEXSD.ExtendedFeatureModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedFeatureModelTypeItemProvider 
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
	public ExtendedFeatureModelTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__PROPERTIES);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__STRUCT);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__CONSTRAINTS);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__CALCULATIONS);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__COMMENTS);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__FEATURE_ORDER);
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
	 * This returns ExtendedFeatureModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtendedFeatureModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ExtendedFeatureModelType_type");
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

		switch (notification.getFeatureID(ExtendedFeatureModelType.class)) {
			case FeatureIDEXSDPackage.EXTENDED_FEATURE_MODEL_TYPE__PROPERTIES:
			case FeatureIDEXSDPackage.EXTENDED_FEATURE_MODEL_TYPE__STRUCT:
			case FeatureIDEXSDPackage.EXTENDED_FEATURE_MODEL_TYPE__CONSTRAINTS:
			case FeatureIDEXSDPackage.EXTENDED_FEATURE_MODEL_TYPE__CALCULATIONS:
			case FeatureIDEXSDPackage.EXTENDED_FEATURE_MODEL_TYPE__COMMENTS:
			case FeatureIDEXSDPackage.EXTENDED_FEATURE_MODEL_TYPE__FEATURE_ORDER:
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
				(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__PROPERTIES,
				 FeatureIDEXSDFactory.eINSTANCE.createPropertiesType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__STRUCT,
				 FeatureIDEXSDFactory.eINSTANCE.createStructType1()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__CONSTRAINTS,
				 FeatureIDEXSDFactory.eINSTANCE.createConstraintsType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__CALCULATIONS,
				 FeatureIDEXSDFactory.eINSTANCE.createCalculationsType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__COMMENTS,
				 FeatureIDEXSDFactory.eINSTANCE.createCommentsType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_FEATURE_MODEL_TYPE__FEATURE_ORDER,
				 FeatureIDEXSDFactory.eINSTANCE.createFeatureOrderType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FeatureIDEXSDEditPlugin.INSTANCE;
	}

}
