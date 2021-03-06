// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Direccion
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject direccionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Direccion";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		id_direccion("id_direccion"),
		pais("pais"),
		ciudad("ciudad"),
		codigoPostal("codigoPostal"),
		calle("calle"),
		altura("altura"),
		piso("piso");

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

	public Direccion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Direccion"));
	}

	protected Direccion(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject direccionMendixObject)
	{
		if (direccionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Direccion", direccionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Direccion");

		this.direccionMendixObject = direccionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Direccion.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Direccion initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Direccion.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Direccion initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Direccion(context, mendixObject);
	}

	public static myfirstmodule.proxies.Direccion load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Direccion.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Direccion> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Direccion> result = new java.util.ArrayList<myfirstmodule.proxies.Direccion>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Direccion" + xpathConstraint))
			result.add(myfirstmodule.proxies.Direccion.initialize(context, obj));
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
	 * @return value of id_direccion
	 */
	public final java.lang.Long getid_direccion()
	{
		return getid_direccion(getContext());
	}

	/**
	 * @param context
	 * @return value of id_direccion
	 */
	public final java.lang.Long getid_direccion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.id_direccion.toString());
	}

	/**
	 * Set value of id_direccion
	 * @param id_direccion
	 */
	public final void setid_direccion(java.lang.Long id_direccion)
	{
		setid_direccion(getContext(), id_direccion);
	}

	/**
	 * Set value of id_direccion
	 * @param context
	 * @param id_direccion
	 */
	public final void setid_direccion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long id_direccion)
	{
		getMendixObject().setValue(context, MemberNames.id_direccion.toString(), id_direccion);
	}

	/**
	 * @return value of pais
	 */
	public final java.lang.String getpais()
	{
		return getpais(getContext());
	}

	/**
	 * @param context
	 * @return value of pais
	 */
	public final java.lang.String getpais(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.pais.toString());
	}

	/**
	 * Set value of pais
	 * @param pais
	 */
	public final void setpais(java.lang.String pais)
	{
		setpais(getContext(), pais);
	}

	/**
	 * Set value of pais
	 * @param context
	 * @param pais
	 */
	public final void setpais(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pais)
	{
		getMendixObject().setValue(context, MemberNames.pais.toString(), pais);
	}

	/**
	 * @return value of ciudad
	 */
	public final java.lang.String getciudad()
	{
		return getciudad(getContext());
	}

	/**
	 * @param context
	 * @return value of ciudad
	 */
	public final java.lang.String getciudad(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ciudad.toString());
	}

	/**
	 * Set value of ciudad
	 * @param ciudad
	 */
	public final void setciudad(java.lang.String ciudad)
	{
		setciudad(getContext(), ciudad);
	}

	/**
	 * Set value of ciudad
	 * @param context
	 * @param ciudad
	 */
	public final void setciudad(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ciudad)
	{
		getMendixObject().setValue(context, MemberNames.ciudad.toString(), ciudad);
	}

	/**
	 * @return value of codigoPostal
	 */
	public final java.lang.Integer getcodigoPostal()
	{
		return getcodigoPostal(getContext());
	}

	/**
	 * @param context
	 * @return value of codigoPostal
	 */
	public final java.lang.Integer getcodigoPostal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.codigoPostal.toString());
	}

	/**
	 * Set value of codigoPostal
	 * @param codigopostal
	 */
	public final void setcodigoPostal(java.lang.Integer codigopostal)
	{
		setcodigoPostal(getContext(), codigopostal);
	}

	/**
	 * Set value of codigoPostal
	 * @param context
	 * @param codigopostal
	 */
	public final void setcodigoPostal(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer codigopostal)
	{
		getMendixObject().setValue(context, MemberNames.codigoPostal.toString(), codigopostal);
	}

	/**
	 * @return value of calle
	 */
	public final java.lang.String getcalle()
	{
		return getcalle(getContext());
	}

	/**
	 * @param context
	 * @return value of calle
	 */
	public final java.lang.String getcalle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.calle.toString());
	}

	/**
	 * Set value of calle
	 * @param calle
	 */
	public final void setcalle(java.lang.String calle)
	{
		setcalle(getContext(), calle);
	}

	/**
	 * Set value of calle
	 * @param context
	 * @param calle
	 */
	public final void setcalle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String calle)
	{
		getMendixObject().setValue(context, MemberNames.calle.toString(), calle);
	}

	/**
	 * @return value of altura
	 */
	public final java.lang.String getaltura()
	{
		return getaltura(getContext());
	}

	/**
	 * @param context
	 * @return value of altura
	 */
	public final java.lang.String getaltura(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.altura.toString());
	}

	/**
	 * Set value of altura
	 * @param altura
	 */
	public final void setaltura(java.lang.String altura)
	{
		setaltura(getContext(), altura);
	}

	/**
	 * Set value of altura
	 * @param context
	 * @param altura
	 */
	public final void setaltura(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String altura)
	{
		getMendixObject().setValue(context, MemberNames.altura.toString(), altura);
	}

	/**
	 * @return value of piso
	 */
	public final java.lang.String getpiso()
	{
		return getpiso(getContext());
	}

	/**
	 * @param context
	 * @return value of piso
	 */
	public final java.lang.String getpiso(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.piso.toString());
	}

	/**
	 * Set value of piso
	 * @param piso
	 */
	public final void setpiso(java.lang.String piso)
	{
		setpiso(getContext(), piso);
	}

	/**
	 * Set value of piso
	 * @param context
	 * @param piso
	 */
	public final void setpiso(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String piso)
	{
		getMendixObject().setValue(context, MemberNames.piso.toString(), piso);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return direccionMendixObject;
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
			final myfirstmodule.proxies.Direccion that = (myfirstmodule.proxies.Direccion) obj;
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
		return "MyFirstModule.Direccion";
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
