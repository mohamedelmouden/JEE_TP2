--------> Spring IoC - Injection de Dépendances avec Spring
---

Spring IoC - Injection de Dépendances avec Spring

QU'EST-CE QUE CE PROJET ?
----------------------------
  Un exemple concret d'injection de dépendances avec
  
  Spring, en utilisant 3 approches différentes :

     Par annotations       (@Autowired, @Component)
     Par fichier XML       (applicationContext.xml)
     Par réflexion Java    (Class.forName + invoke)




 COMMENT LANCER ?
------------------

---->  Profil DEV (annotations) :
  
  - Executer Presentation2.java
  
  - Resultat attendu : 300.0  (150.0 * 2)

  Profil PROD (XML) :
  ------
  -> Executer PresentationXML.java
  
  -> Resultat attendu : selon applicationContext.xml




 PREREQUIS
----
  . Java 8+
  . Maven
  . Spring Context (dependance dans pom.xml)
  . JUnit 4

architecture
----


<img width="621" height="911" alt="image" src="https://github.com/user-attachments/assets/c31d83b3-3857-46d5-9160-8074cf500b45" />



video d'execution finale _
-----



https://github.com/user-attachments/assets/ef263701-2ff5-4c30-9e80-67b475178614




























