# Jenkins Lab 3 - Configuring Shared-Library Multibranch Pipeline

**Presented to:**    
_Mohamed Swelam_    

**Presented by:**   
_Islam Khaled_    

22 June 2023

-----------------------------------------
## 1- What is the benefit of using master-slave architecture rather than building on master only?

The master-slave architecture offers several benefits over using only a master:    
- Slaves can run on different platforms or environments. This enables you to perform builds and deployments on various operating systems.    
- You can distribute the workload across multiple machines or agents.
- Parallel execution of tasks across multiple slaves. 
- Enhances the availability of Jenkins infrastructure. If the master node goes down or experiences any issues, the slaves can continue to work independently and handle the ongoing jobs.

-----------------------------------------
## 2- What is different between authorization and authentication ? 

- __Authentication__ answers the question, "Who are you?". It is the process of verifying the identity of a user attempting to access a system or resource.
- __Authorization__ answers the question, "What are you allowed to do?". It is the process of granting or denying access rights and permissions to authenticated users based on their roles, privileges, or other attributes.

-----------------------------------------
## Make jenkins-shared-library and make your jenkinsfile which you used in lab2 to point to this library 

- Configure ```shared-lib``` on Jenkins

![1](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/a393f8f5-91e9-460b-bea9-3886dac3f4ba)
![2](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/b2c8e32f-6ef7-4c78-97a5-4efffbe04bbe)

- Creating groovy filea on this repo: ```shared-lib-pipeline```

Filea Links: [buildImage.groovy](https://github.com/eslamkhaled560/shared-lib-pipeline/blob/main/vars/buildImage.groovy) , [pushImage.groovy](https://github.com/eslamkhaled560/shared-lib-pipeline/blob/main/vars/pushImage.groovy) , [cleanUp.groovy](https://github.com/eslamkhaled560/shared-lib-pipeline/blob/main/vars/cleanUp.groovy)

![3](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/96a9095a-94dd-4bf1-8b43-06c9cfed0978)

- I made ```Jenkinsfile``` changes on the ```test```` brach, not to affect the main brach file used fot the previous lab.

File Link: [Jenkinsfile](https://github.com/eslamkhaled560/simple-app/blob/test/Jenkinsfile)

![4](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/3c8d665e-6802-4c1e-8619-35700d890f38)

- Building ```test``` braanch in ```multibranch-simple-app```

![5](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/691616d7-a707-4aa6-a65f-9503722a6878)

- Console and docker hub output

![Studio_Project_V9](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/f5a32a33-b304-4be4-9780-e055682f2b8a)

-----------------------------------------
