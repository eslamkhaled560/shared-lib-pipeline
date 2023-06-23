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

- Creating groovy files on this repo: ```shared-lib-pipeline```

Files Links: [buildImage.groovy](https://github.com/eslamkhaled560/shared-lib-pipeline/blob/main/vars/buildImage.groovy) , [pushImage.groovy](https://github.com/eslamkhaled560/shared-lib-pipeline/blob/main/vars/pushImage.groovy) , [cleanUp.groovy](https://github.com/eslamkhaled560/shared-lib-pipeline/blob/main/vars/cleanUp.groovy)

![3](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/96a9095a-94dd-4bf1-8b43-06c9cfed0978)

- I made ```Jenkinsfile``` changes on the ```test``` branch, not to affect the main branch file used for the previous lab.

File Link: [Jenkinsfile-test](https://github.com/eslamkhaled560/simple-app/blob/test/Jenkinsfile)

![image](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/d1f89c22-4cf1-4886-8b4b-5387e174e876)

- Building ```test``` branch in ```multibranch-simple-app```

![5](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/691616d7-a707-4aa6-a65f-9503722a6878)

- Console and docker hub output

![Studio_Project_V9](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/f5a32a33-b304-4be4-9780-e055682f2b8a)

-----------------------------------------
## 4- Try to make new slave as container or ec2 server and configure master to use it 

- Connect to ```aws-agent``` instance

![1](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/e8774b54-344d-4435-9c9c-e31115f323b1)

- Configure __Java, Docker, Git__ on ```aws-agent```, and create __jenkins_home__ directory

![2](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/0cbde0ca-40f5-4ce2-a69b-491474993090)

- Configure Jenkins-Agent ssh connection

![3](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/4ce35b7b-47e3-4f37-8673-77cc3175abe6)

- Add ssh credentials to Jenkins

![4](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/fec7e3d6-bdf8-43bb-8d70-6adaa780fd78)

- Configure ```aws-agent``` on Jenkins

![5](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/4daba2c0-4a17-47c4-a6c2-0a340afb19f8)
![6](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/bd8e0255-0076-47ae-b030-2952fa1ed44d)

- I made ```Jenkinsfile``` changes on the ```dev``` branch, not to affect the main branch file used for the previous lab.

File Link: [Jenkinsfile-dev](https://github.com/eslamkhaled560/simple-app/blob/dev/Jenkinsfile)

![7](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/2e54157c-073a-47ca-a40f-88ef14b62a4b)

- Building ```dev``` branch in ```multibranch-simple-app```

![8](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/5b241550-3971-43ab-a42a-90c76330dd60)

- Console and docker hub output
 
![Studio_Project_V11](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/195fed31-d72e-43d4-b486-b4be1a4d8806)

- Check ```~/jenkins_home/workspace``` on ```aws-agent```

![image](https://github.com/eslamkhaled560/shared-lib-pipeline/assets/54172897/4af0ca46-4cfa-42b8-b903-c3ba0e290b4d)


-----------------------------------------
