Spring is a framework which helps to develop Java applications rapidly and easily.
This project uses XML configuration for beans. Concepts implemented/used in here are:
- Bean Scopes; Singleton & Prototype. Default scope is Singleton.
- Bean Life Cycle; 2 ways - xml or Java configuration.
- Bean Post Processors - using BeanPostProcessor interface.
- Bean Definition Inheritance; 2 ways - Bean template or from another class.
- Injecting Inner Beans
- Injecting Collection; List, Set, Map, Properties.

To understand this, run SpringApplication.java as a Java Application.
Bean Life cycle can be managed either by XML or Java configuration. 
XML configuration is implemented for Vendor class and Java configuration is implemented for Customer class.

Interesting Reads
-----------------
- What is [IOC](https://www.java2novice.com/java_interview_questions/inversion-of-control/)
 .. [more here](https://www.tutorialsteacher.com/ioc/inversion-of-control)
 
- What is [Spring Context](https://dzone.com/articles/what-is-a-spring-context) ? 