// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class TipoDocComercial
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tipoDocComercialMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.TipoDocComercial";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		id_tipo_doc("id_tipo_doc"),
		tipo("tipo");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TipoDocComercial(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.TipoDocComercial"));
	}

	protected TipoDocComercial(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tipoDocComercialMendixObject)
	{
		if (tipoDocComercialMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.TipoDocComercial", tipoDocComercialMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.TipoDocComercial");

		this.tipoDocComercialMendixObject = tipoDocComercialMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TipoDocComercial.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.TipoDocComercial initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.TipoDocComercial.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.TipoDocComercial initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.TipoDocComercial(context, mendixObject);
	}

	public static myfirstmodule.proxies.TipoDocComercial load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.TipoDocComercial.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.TipoDocComercial> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.TipoDocComercial> result = new java.util.ArrayList<myfirstmodule.proxies.TipoDocComercial>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.TipoDocComercial" + xpathConstraint))
			result.add(myfirstmodule.proxies.TipoDocComercial.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of id_tipo_doc
	 */
	public final java.lang.Long getid_tipo_doc()
	{
		return getid_tipo_doc(getContext());
	}

	/**
	 * @param context
	 * @return value of id_tipo_doc
	 */
	public final java.lang.Long getid_tipo_doc(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.id_tipo_doc.toString());
	}

	/**
	 * Set value of id_tipo_doc
	 * @param id_tipo_doc
	 */
	public final void setid_tipo_doc(java.lang.Long id_tipo_doc)
	{
		setid_tipo_doc(getContext(), id_tipo_doc);
	}

	/**
	 * Set value of id_tipo_doc
	 * @param context
	 * @param id_tipo_doc
	 */
	public final void setid_tipo_doc(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long id_tipo_doc)
	{
		getMendixObject().setValue(context, MemberNames.id_tipo_doc.toString(), id_tipo_doc);
	}

	/**
	 * @return value of tipo
	 */
	public final java.lang.String gettipo()
	{
		return gettipo(getContext());
	}

	/**
	 * @param context
	 * @return value of tipo
	 */
	public final java.lang.String gettipo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.tipo.toString());
	}

	/**
	 * Set value of tipo
	 * @param tipo
	 */
	public final void settipo(java.lang.String tipo)
	{
		settipo(getContext(), tipo);
	}

	/**
	 * Set value of tipo
	 * @param context
	 * @param tipo
	 */
	public final void settipo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tipo)
	{
		getMendixObject().setValue(context, MemberNames.tipo.toString(), tipo);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tipoDocComercialMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.TipoDocComercial that = (myfirstmodule.proxies.TipoDocComercial) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.TipoDocComercial";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
