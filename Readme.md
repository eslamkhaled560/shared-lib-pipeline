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