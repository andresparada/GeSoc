// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Egreso
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject egresoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Egreso";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		id_egreso("id_egreso"),
		fecha("fecha"),
		moneda("moneda"),
		proveedor("proveedor"),
		mediosDePago("mediosDePago"),
		datosPropios("datosPropios"),
		items("items");

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

	public Egreso(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Egreso"));
	}

	protected Egreso(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject egresoMendixObject)
	{
		if (egresoMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Egreso", egresoMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Egreso");

		this.egresoMendixObject = egresoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Egreso.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Egreso initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Egreso.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Egreso initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Egreso(context, mendixObject);
	}

	public static myfirstmodule.proxies.Egreso load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Egreso.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Egreso> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Egreso> result = new java.util.ArrayList<myfirstmodule.proxies.Egreso>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Egreso" + xpathConstraint))
			result.add(myfirstmodule.proxies.Egreso.initialize(context, obj));
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
	 * @return value of id_egreso
	 */
	public final java.lang.Long getid_egreso()
	{
		return getid_egreso(getContext());
	}

	/**
	 * @param context
	 * @return value of id_egreso
	 */
	public final java.lang.Long getid_egreso(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.id_egreso.toString());
	}

	/**
	 * Set value of id_egreso
	 * @param id_egreso
	 */
	public final void setid_egreso(java.lang.Long id_egreso)
	{
		setid_egreso(getContext(), id_egreso);
	}

	/**
	 * Set value of id_egreso
	 * @param context
	 * @param id_egreso
	 */
	public final void setid_egreso(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long id_egreso)
	{
		getMendixObject().setValue(context, MemberNames.id_egreso.toString(), id_egreso);
	}

	/**
	 * @return value of fecha
	 */
	public final java.util.Date getfecha()
	{
		return getfecha(getContext());
	}

	/**
	 * @param context
	 * @return value of fecha
	 */
	public final java.util.Date getfecha(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.fecha.toString());
	}

	/**
	 * Set value of fecha
	 * @param fecha
	 */
	public final void setfecha(java.util.Date fecha)
	{
		setfecha(getContext(), fecha);
	}

	/**
	 * Set value of fecha
	 * @param context
	 * @param fecha
	 */
	public final void setfecha(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date fecha)
	{
		getMendixObject().setValue(context, MemberNames.fecha.toString(), fecha);
	}

	/**
	 * @return value of moneda
	 */
	public final java.lang.String getmoneda()
	{
		return getmoneda(getContext());
	}

	/**
	 * @param context
	 * @return value of moneda
	 */
	public final java.lang.String getmoneda(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.moneda.toString());
	}

	/**
	 * Set value of moneda
	 * @param moneda
	 */
	public final void setmoneda(java.lang.String moneda)
	{
		setmoneda(getContext(), moneda);
	}

	/**
	 * Set value of moneda
	 * @param context
	 * @param moneda
	 */
	public final void setmoneda(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String moneda)
	{
		getMendixObject().setValue(context, MemberNames.moneda.toString(), moneda);
	}

	/**
	  * The contents of the binary field will be written to the output stream.
	  * The output stream will be closed at the end.
	  *
	  * @param context
	  * @param outputStream
	  */
	public final void getproveedor(com.mendix.systemwideinterfaces.core.IContext context, java.io.OutputStream outputStream)
	{
		com.mendix.core.objectmanagement.member.MendixBinary binary = (com.mendix.core.objectmanagement.member.MendixBinary) getMendixObject().getMember(context, MemberNames.proveedor.toString());
		binary.retrieveValue(context, outputStream);
	}

	/**
	  * Stores the bytes from the given InputStream.
	  *
	  * Please note that the input stream will be immediately sent to the data store,
	  * whether you commit the Mendix object or not.
	  *
	  * @param context
	  * @param inputStream
	  * @param length the number of bytes in the stream
	  */
	public final void setproveedor(com.mendix.systemwideinterfaces.core.IContext context, java.io.InputStream inputStream, long length)
	{
		if (getMendixObject().getState() == com.mendix.systemwideinterfaces.core.IMendixObject.ObjectState.INSTANTIATED)
			try { commit(); } catch (com.mendix.core.CoreException ex) { }
		com.mendix.core.objectmanagement.member.MendixBinary binary = (com.mendix.core.objectmanagement.member.MendixBinary) getMendixObject().getMember(context, MemberNames.proveedor.toString());
		binary.storeValue(context, inputStream, length);
	}

	/**
	  * The contents of the binary field will be written to the output stream.
	  * The output stream will be closed at the end.
	  *
	  * @param context
	  * @param outputStream
	  */
	public final void getmediosDePago(com.mendix.systemwideinterfaces.core.IContext context, java.io.OutputStream outputStream)
	{
		com.mendix.core.objectmanagement.member.MendixBinary binary = (com.mendix.core.objectmanagement.member.MendixBinary) getMendixObject().getMember(context, MemberNames.mediosDePago.toString());
		binary.retrieveValue(context, outputStream);
	}

	/**
	  * Stores the bytes from the given InputStream.
	  *
	  * Please note that the input stream will be immediately sent to the data store,
	  * whether you commit the Mendix object or not.
	  *
	  * @param context
	  * @param inputStream
	  * @param length the number of bytes in the stream
	  */
	public final void setmediosDePago(com.mendix.systemwideinterfaces.core.IContext context, java.io.InputStream inputStream, long length)
	{
		if (getMendixObject().getState() == com.mendix.systemwideinterfaces.core.IMendixObject.ObjectState.INSTANTIATED)
			try { commit(); } catch (com.mendix.core.CoreException ex) { }
		com.mendix.core.objectmanagement.member.MendixBinary binary = (com.mendix.core.objectmanagement.member.MendixBinary) getMendixObject().getMember(context, MemberNames.mediosDePago.toString());
		binary.storeValue(context, inputStream, length);
	}

	/**
	  * The contents of the binary field will be written to the output stream.
	  * The output stream will be closed at the end.
	  *
	  * @param context
	  * @param outputStream
	  */
	public final void getdatosPropios(com.mendix.systemwideinterfaces.core.IContext context, java.io.OutputStream outputStream)
	{
		com.mendix.core.objectmanagement.member.MendixBinary binary = (com.mendix.core.objectmanagement.member.MendixBinary) getMendixObject().getMember(context, MemberNames.datosPropios.toString());
		binary.retrieveValue(context, outputStream);
	}

	/**
	  * Stores the bytes from the given InputStream.
	  *
	  * Please note that the input stream will be immediately sent to the data store,
	  * whether you commit the Mendix object or not.
	  *
	  * @param context
	  * @param inputStream
	  * @param length the number of bytes in the stream
	  */
	public final void setdatosPropios(com.mendix.systemwideinterfaces.core.IContext context, java.io.InputStream inputStream, long length)
	{
		if (getMendixObject().getState() == com.mendix.systemwideinterfaces.core.IMendixObject.ObjectState.INSTANTIATED)
			try { commit(); } catch (com.mendix.core.CoreException ex) { }
		com.mendix.core.objectmanagement.member.MendixBinary binary = (com.mendix.core.objectmanagement.member.MendixBinary) getMendixObject().getMember(context, MemberNames.datosPropios.toString());
		binary.storeValue(context, inputStream, length);
	}

	/**
	 * @return value of items
	 */
	public final java.lang.String getitems()
	{
		return getitems(getContext());
	}

	/**
	 * @param context
	 * @return value of items
	 */
	public final java.lang.String getitems(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.items.toString());
	}

	/**
	 * Set value of items
	 * @param items
	 */
	public final void setitems(java.lang.String items)
	{
		setitems(getContext(), items);
	}

	/**
	 * Set value of items
	 * @param context
	 * @param items
	 */
	public final void setitems(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String items)
	{
		getMendixObject().setValue(context, MemberNames.items.toString(), items);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return egresoMendixObject;
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
			final myfirstmodule.proxies.Egreso that = (myfirstmodule.proxies.Egreso) obj;
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
		return "MyFirstModule.Egreso";
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
