����һ����̬��spring��Ŀ������

��̬������spring bean,����entity,dao,manager(service),controller�ȵ� ��̬��֮������໥
���ã��޸ĵĴ��루.java/.groovy��ֱ�����ӵ�app��ӦĿ¼�£��ڲ���Ҫ����app������£��Զ�
�������java class �ֽ��룬����ӣ��滻����spring bean��,���ҿ����ظ��滻.ͬʱɾ����java�ļ�
��Ӧ��classҲ���spring bean ��ɾ��
�ڱ���Ŀ�У�.java/.groovy����ɾ�޸���ͬ.jsp/phpһ��

1-hi-utils �ǹ��߰�

2-hi-spring-dynamic �Ǳ���Ŀ

3-hi-springMvcWeb ����(spring mvc+hibernate+spring-dynimic)

3-hi-springScript ��java��,Ҳ����ָͨ����ҵ��㣬��Ϊ�Ƕ�̬��propertyEditor ,interceptorҲ����д������,
����һ�� linked source���͵��ļ���,ָ�� 3-hi-springMvcWeb\WebRoot\WEB-INF\script ���������ڱ����ļ����£�
��3-hi-springScript��Ŀ���޸ĺ�Ĵ��룬�ڲ�ʽ��������ͬ.jspһ����������Ч�������������£���������
ֱ�ӽ�(.java/.grooy)��������Ӧ���ļ�����WebRoot\WEB-INF\script���漴��Ч����������web����(tomcat)

The spring-dynamic project and it'samples
 
the spring-dynamic project can generate spring bean dynamically,The dynamic java/groovy file can be 
import to another dynamic java/groovy file. They all can be add ,modify,delete,and then the spring context does
the same.
In spring-dyanmaic ,.java/.groovy can be deployed just like .jsp/php

1-hi-utils folder is tool project and depended by the spring-dyamic project
2-hi-spring-dynamic folder contains spring-dynamic project
3-hi-springMvcWeb is the sample(spring mvc+hibernate+spring-dynimic)
3-hi-springScript js java(scprit) project,it has a linked source folder to 3-hi-springMvcWeb\WebRoot\WEB-INF\script
java/groovy file in 3-hi-springScript can be deployed as .jsp file,and not need restart the webapp container(tomcat) 







