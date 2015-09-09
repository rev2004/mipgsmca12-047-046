ONLINE INTRUSION ALERT AGGREGATION WITH GENERATIVE DATA STREAM MODELING

ABSTRACT:
Alert aggregation is an important subtask of intrusion detection. The goal is to identify and to cluster different alerts—produced by low-level intrusion detection systems, firewalls, etc.—belonging to a specific attack instance which has been initiated by an attacker at a certain point in time. Thus, meta-alerts can be generated for the clusters that contain all the relevant information whereas the amount of data (i.e., alerts) can be reduced substantially. Meta-alerts may then be the basis for reporting to security experts or for communication within a distributed intrusion detection system. We propose a novel technique for online alert aggregation which is based on a dynamic, probabilistic model of the current attack situation. Basically, it can be regarded as a data stream version of a maximum likelihood approach for the estimation of the model parameters. With three benchmark data sets, we demonstrate that it is possible to achieve reduction rates of up to 99.96 percent while the number of missing meta-alerts is extremely low. In addition, meta-alerts are generated with a delay of typically only a few seconds after observing the first alert belonging to a new attack instance.

OUR CONTRIBUTION:

The Authors proposed methods on many Intrusion Alerts. As our contribution, we make the system more efficient in identify the intrusion alerts and also we extend this work by sending the Alerts as Message to the Network Administrator who governs the Network or Intrusion Detection System.

EXISTING SYSTEM

•	Most existing IDS are optimized to detect attacks with high accuracy. However, they still have various disadvantages that have been outlined in a number of publications and a lot of work has been done to analyze IDS in order to direct future research.

•	Besides others, one drawback is the large amount of alerts produced.

•	Alerts can be given only in System logs.

•	Existing IDS does not have general framework which cannot be customized by adding domain specific knowledge as per the specific requirements of the users or network administrators.

PROPOSED SYSTEM

•	Online Intrusion Alert Aggregation with Generative Data Stream Modeling is a generative modeling approach using probabilistic methods. Assuming that attack instances can be regarded as random processes “producing” alerts, we aim at modeling these processes using approximative maximum likelihood parameter estimation techniques. Thus, the beginning as well as the completion of attack instances can be detected.

•	It is a data stream approach, i.e., each observed alert is processed only a few times. Thus, it can be applied online and under harsh timing constraints.

•	In the proposed scheme of Online Intrusion Alert Aggregation with Generative Data Stream Modeling, we extend our idea of sending Intrusion alerts to the mobile. This makes the process easier and comfortable.

•	Online Intrusion Alert Aggregation with Generative Data Stream Modeling does not degrade system performance as individual layers are independent and are trained with only a small number of features, thereby, resulting in an efficient system.

•	Online Intrusion Alert Aggregation with Generative Data Stream Modeling is easily customizable and the number of layers can be adjusted depending upon the requirements of the target network. Our framework is not restrictive in using a single method to detect attacks. Different methods can be seamlessly integrated in our framework to build effective intrusion detectors.

•	Our framework has the advantage that the type of attack can be inferred directly from the layer at which it is detected. As a result, specific intrusion response mechanisms can be activated for different attacks.


HARDWARE REQUIREMENTS
•	SYSTEM		: Pentium IV 2.4 GHz
•	HARD DISK		: 40 GB
•	MONITOR		: 15 VGA colour
•	MOUSE		: Logitech.
•	RAM			: 256 MB
•	KEYBOARD		: 110 keys enhanced.

SOFTWARE REQUIREMENTS
•	Operating system 	:  	Windows XP Professional
•	Front End  		:  	JAVA, RMI, JDBC, Swing
•	Tool                    	:	Eclipse 3.3


MODULES

•	Server
•	Client
•	DARPA DataSet
•	Mobile
•	Attack Simulation

Server
> Server module is the main module for this project. This module acts as the Intrusion Detection System. This module consists of four layers viz. sensor layer (which detects the user/client etc.), Detection layer, alert processing layer and reaction layer. In addition there is also Message Log, where all the alerts and messages are stored for the references. This Message Log can also be saved as Log file for future references for any network environment.

Client
> Client module is developed for testing the Intrusion Detection System. In this module the client can enter only with a valid user name and password. If an intruder enters with any guessing passwords then the alert is given to the Server and the intruder is also blocked. Even if the valid user enters the correct user name and password, the user can use only for minimum number of times. For example even if the valid user makes the login for repeated number of times, the client will be blocked and the alert is sent to the admin. In the process level intrusion, each client would have given a specific process only. For example, a client may have given permission only for P1process. If the client tries to make more then these processes the client will be blocked and the alert is given by the Intrusion Detection System. In this client module the client can be able to send data. Here, when ever data is sent Intrusion Detection System checks for the file. If the size of the file is large then it is restricted or else the data is sent.

DARPA Dataset

This module is integrated in the Server module. This is an offline type of testing the intrusions. In this module, the DARPA Data Set is used to check the technique of the Online Intrusion Alert Aggregation with Generative Data Stream Modeling. The DARPA data set is downloaded and separated according to each layers. So we test the instance of DARPA Dataset using the open file dialog box. Whenever the dataset is chosen based on the conditions specified the Intrusion Detection System works.
Mobile

> This module is developed using J2ME. The traditional system uses the message log for storing the alerts. In this system, the system admin or user can get the alerts in their mobile. Whenever alert message received in the message log of the server, the mobile too receives the alert message.

Attack Simulation

> In this module, the attack simulation is made for ourself to test the system. Attacks are classified and made to simulate here. Whenever an attack is launched the Intrusion Detection System must be capable of detecting it. So our system will also be capable of detecting such attacks. For example if an IP trace attack is launched, the Intrusion Detection System must detect it and must kill or block the process.

ALGORITHM FOR THE PROPOSED IDS

ALERT AGGREGATION ALGORITHM:

Step 1: Select the ‘n’ layers needed for the whole IDS.
Step 2: Build Sensor Layer to detect Network and Host Systems.
Step 3: Build Detection Layer based on Misuse and Anomaly detection technique.
Step 4: Classify various types of alerts. (For example alert for System level intrusion or process level intrusion)
Step 5: Code the system for detecting various types of attacks and alerts for respective attacks.
Step 6: Integrate the system with Mobile device to get alerts from the proposed IDS.
Step 7: Specify each type of alert on which category it falls, so that user can easily recognize the attack type.
Step 8: Build Reaction layer with various options so that administrator/user can have various options to select or react on any type of intrusion.
Step 9: Test the system using Attack Simulation module, by sending different attacks to the proposed IDS.
Step 10: Build a log file, so that all the reports generated can be saved for future references.

REFERENCES:
•	Alexander Hofmann and Bernhard Sick, “Online Intrusion Alert Aggregation with Generative Data Stream Modeling”, IEEE Transactions on Dependable and Secure Computing, Vol. 8, No. 2, March – April 2011.
•	Kapil Kumar Gupta, Baikunth Nath and Ramamohanarao Kotagiri, “Layered        Approach using Conditional Random Fields for Intrusion Detection”, IEEE Transactions on Dependable and Secure Computing, Vol.7, No.1, January-March 2010.