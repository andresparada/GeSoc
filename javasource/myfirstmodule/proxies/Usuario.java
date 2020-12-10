// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Usuario
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject usuarioMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Usuario";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		id_usuario("id_usuario"),
		nombreUusario("nombreUusario"),
		contrasenia("contrasenia"),
		tipoUsuario("tipoUsuario");

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

	public Usuario(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Usuario"));
	}

	protected Usuario(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject usuarioMendixObject)
	{
		if (usuarioMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Usuario", usuarioMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Usuario");

		this.usuarioMendixObject = usuarioMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Usuario.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Usuario initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Usuario.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Usuario initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Usuario(context, mendixObject);
	}

	public static myfirstmodule.proxies.Usuario load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Usuario.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Usuario> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Usuario> result = new java.util.ArrayList<myfirstmodule.proxies.Usuario>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Usuario" + xpathConstraint))
			result.add(myfirstmodule.proxies.Usuario.initialize(context, obj));
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
	 * @return value of id_usuario
	 */
	public final java.lang.Long getid_usuario()
	{
		return getid_usuario(getContext());
	}

	/**
	 * @param context
	 * @return value of id_usuario
	 */
	public final java.lang.Long getid_usuario(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.id_usuario.toString());
	}

	/**
	 * Set value of id_usuario
	 * @param id_usuario
	 */
	public final void setid_usuario(java.lang.Long id_usuario)
	{
		setid_usuario(getContext(), id_usuario);
	}

	/**
	 * Set value of id_usuario
	 * @param context
	 * @param id_usuario
	 */
	public final void setid_usuario(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long id_usuario)
	{
		getMendixObject().setValue(context, MemberNames.id_usuario.toString(), id_usuario);
	}

	/**
	 * @return value of nombreUusario
	 */
	public final java.lang.String getnombreUusario()
	{
		return getnombreUusario(getContext());
	}

	/**
	 * @param context
	 * @return value of nombreUusario
	 */
	public final java.lang.String getnombreUusario(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.nombreUusario.toString());
	}

	/**
	 * Set value of nombreUusario
	 * @param nombreuusario
	 */
	public final void setnombreUusario(java.lang.String nombreuusario)
	{
		setnombreUusario(getContext(), nombreuusario);
	}

	/**
	 * Set value of nombreUusario
	 * @param context
	 * @param nombreuusario
	 */
	public final void setnombreUusario(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nombreuusario)
	{
		getMendixObject().setValue(context, MemberNames.nombreUusario.toString(), nombreuusario);
	}

	/**
	 * @return value of contrasenia
	 */
	public final java.lang.String getcontrasenia()
	{
		return getcontrasenia(getContext());
	}

	/**
	 * @param context
	 * @return value of contrasenia
	 */
	public final java.lang.String getcontrasenia(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.contrasenia.toString());
	}

	/**
	 * Set value of contrasenia
	 * @param contrasenia
	 */
	public final void setcontrasenia(java.lang.String contrasenia)
	{
		setcontrasenia(getContext(), contrasenia);
	}

	/**
	 * Set value of contrasenia
	 * @param context
	 * @param contrasenia
	 */
	public final void setcontrasenia(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String contrasenia)
	{
		getMendixObject().setValue(context, MemberNames.contrasenia.toString(), contrasenia);
	}

	/**
	 * @return value of tipoUsuario
	 */
	public final java.lang.String gettipoUsuario()
	{
		return gettipoUsuario(getContext());
	}

	/**
	 * @param context
	 * @return value of tipoUsuario
	 */
	public final java.lang.String gettipoUsuario(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.tipoUsuario.toString());
	}

	/**
	 * Set value of tipoUsuario
	 * @param tipousuario
	 */
	public final void settipoUsuario(java.lang.String tipousuario)
	{
		settipoUsuario(getContext(), tipousuario);
	}

	/**
	 * Set value of tipoUsuario
	 * @param context
	 * @param tipousuario
	 */
	public final void settipoUsuario(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tipousuario)
	{
		getMendixObject().setValue(context, MemberNames.tipoUsuario.toString(), tipousuario);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return usuarioMendixObject;
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
			final myfirstmodule.proxies.Usuario that = (myfirstmodule.proxies.Usuario) obj;
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
		return "MyFirstModule.Usuario";
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
