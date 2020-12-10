// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class OSC
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject oSCMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.OSC";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		id_osc("id_osc"),
		personal("personal"),
		actividad("actividad");

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

	public OSC(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.OSC"));
	}

	protected OSC(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject oSCMendixObject)
	{
		if (oSCMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.OSC", oSCMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.OSC");

		this.oSCMendixObject = oSCMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'OSC.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.OSC initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.OSC.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.OSC initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.OSC(context, mendixObject);
	}

	public static myfirstmodule.proxies.OSC load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.OSC.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.OSC> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.OSC> result = new java.util.ArrayList<myfirstmodule.proxies.OSC>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.OSC" + xpathConstraint))
			result.add(myfirstmodule.proxies.OSC.initialize(context, obj));
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
	 * @return value of id_osc
	 */
	public final java.lang.Long getid_osc()
	{
		return getid_osc(getContext());
	}

	/**
	 * @param context
	 * @return value of id_osc
	 */
	public final java.lang.Long getid_osc(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.id_osc.toString());
	}

	/**
	 * Set value of id_osc
	 * @param id_osc
	 */
	public final void setid_osc(java.lang.Long id_osc)
	{
		setid_osc(getContext(), id_osc);
	}

	/**
	 * Set value of id_osc
	 * @param context
	 * @param id_osc
	 */
	public final void setid_osc(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long id_osc)
	{
		getMendixObject().setValue(context, MemberNames.id_osc.toString(), id_osc);
	}

	/**
	 * @return value of personal
	 */
	public final java.lang.Long getpersonal()
	{
		return getpersonal(getContext());
	}

	/**
	 * @param context
	 * @return value of personal
	 */
	public final java.lang.Long getpersonal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.personal.toString());
	}

	/**
	 * Set value of personal
	 * @param personal
	 */
	public final void setpersonal(java.lang.Long personal)
	{
		setpersonal(getContext(), personal);
	}

	/**
	 * Set value of personal
	 * @param context
	 * @param personal
	 */
	public final void setpersonal(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long personal)
	{
		getMendixObject().setValue(context, MemberNames.personal.toString(), personal);
	}

	/**
	 * @return value of actividad
	 */
	public final java.lang.String getactividad()
	{
		return getactividad(getContext());
	}

	/**
	 * @param context
	 * @return value of actividad
	 */
	public final java.lang.String getactividad(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.actividad.toString());
	}

	/**
	 * Set value of actividad
	 * @param actividad
	 */
	public final void setactividad(java.lang.String actividad)
	{
		setactividad(getContext(), actividad);
	}

	/**
	 * Set value of actividad
	 * @param context
	 * @param actividad
	 */
	public final void setactividad(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String actividad)
	{
		getMendixObject().setValue(context, MemberNames.actividad.toString(), actividad);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return oSCMendixObject;
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
			final myfirstmodule.proxies.OSC that = (myfirstmodule.proxies.OSC) obj;
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
		return "MyFirstModule.OSC";
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
