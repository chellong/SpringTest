spring��hibernate�ļ��ɣ����ʽ����

1��openSession��getCurrentSession������
	* openSession����رգ�currentSession������������Զ��ر�
	* openSessionû�к͵�ǰ�̰߳󶨣�currentSession�͵�ǰ�̰߳�
	
2�����ʹ��currentSession��Ҫ��hibernate.cfg.xml�ļ��н������ã�
	* ����Ǳ�������jdbc����
		<property name="hibernate.current_session_context_class">thread</property>
	* �����ȫ������jta����
	<property name="hibernate.current_session_context_class">jta</property>