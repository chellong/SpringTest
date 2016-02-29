spring对AOP的支持（采用配置方式）

1、spring的依赖包配置
	* SPRING_HOME/dist/spring.jar
	* SPRING_HOME/lib/log4j/log4j-1.2.14.jar
	* SPRING_HOME/lib/jakarta-commons/commons-logging.jar
	* SPRING_HOME/lib/aspectj/*.jar
	
2、具体配置
	<aop:config>
		<aop:aspect id="securityAspect" ref="securityHandler">
			<aop:pointcut id="addAddMethod" expression="execution(* add*(..))"/>
			<aop:before method="checkSecurity" pointcut-ref="addAddMethod"/>
		</aop:aspect>
	</aop:config>
	
3、了解表达式的基本语法：
	* 匹配返回值
	* 匹配包
	* 匹配方法
	* 匹配参数	
