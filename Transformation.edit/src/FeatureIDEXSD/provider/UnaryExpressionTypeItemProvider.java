/**
 */
package FeatureIDEXSD.provider;


import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.UnaryExpressionType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link FeatureIDEXSD.UnaryExpressionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryExpressionTypeItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP);
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
	 * This returns UnaryExpressionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnaryExpressionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UnaryExpressionType_type");
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

		switch (notification.getFeatureID(UnaryExpressionType.class)) {
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
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
				(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ,
					 FeatureIDEXSDFactory.eINSTANCE.createConjType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ,
					 FeatureIDEXSDFactory.eINSTANCE.createDisjType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ,
					 FeatureIDEXSDFactory.eINSTANCE.createEqType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP,
					 FeatureIDEXSDFactory.eINSTANCE.createImpType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT,
					 FeatureIDEXSDFactory.eINSTANCE.createNotType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR,
					 FeatureIDEXSDFactory.eINSTANCE.createVarType())));
	}

}
