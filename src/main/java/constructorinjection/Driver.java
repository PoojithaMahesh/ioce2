package constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import springday1e2.Mobile;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("m.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	constructorinjection.Mobile mobile=(constructorinjection.Mobile) beanFactory.getBean("mobile");
	System.out.println(mobile);
}
}
