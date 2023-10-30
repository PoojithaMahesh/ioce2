package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resourc=new ClassPathResource("d.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resourc);
	Charger charger=(Charger) beanFactory.getBean("charger1");
	System.out.println(charger);
	Mobile mobile=(Mobile)beanFactory.getBean("mobile");
	System.out.println(mobile);
}
}
