
Interactive Travel Agency Application and Ecosystem
=========
Aurhor: Zhe Xu
-------------

#### MIC_BackPackers_FianlProjects ####

`Problem Statement`   	: Designed and developped a travel agency app called Backpackers,  a commercial application that 
finds schedule and discount rates and benefits  of travel-related purchases for customers, also a communication system for organizations and administrative operations

		
`Instructions`  ：

* Overall, in the ecosystem of this application, the "Backpackers", there are two types of enterprises: 1. Industrial, and Neighborhood version. Each enterprise has similar features but has a bit differences: as literally denoted, the Industrial version is for companies and organizations, for example if a department from Amazon is doing business traveling on behalf of the company, or a NBA team is going to a game on the road, they will all use this version of "Backpackers". The features it has that is different to the Neighborhood version are: booking meeting room in the hotel and booking business cabins on the train, which favor to their business and team work purposes during the trip.

Different types of Organizations have their corresponding functionalities using BackPackers. For:
                
        1: Customers, Register and Login in the main JPanel and then take advantage of the functions provided by third party companies to have better user experiences in travelling-related purchases.


		2: The Third Party, Login in the main JPanel to create and manage their productions to customers to utilize the customers resources assembled by BackPackers.


		3: Administrator, Login in the main JPanel to supervise, manage and make analysis the customers and the third party organizations to make BackPackers run well.

`Approaches`	: Stepping in a new era of digital media and market, customers among all ages, especially the middle-ages and elderlies, are in separate need of having a one-stop service and management, in terms of traveling…
 
                                
                                
       
        1: Used DB4O (Database for Object) to keep track o the ecosystem of our software


		2: Distributed each role of organizations accordingly into separate packages 


		3: Imported and applied multiple libraries/APIs: Jcalendar, Jfreechart, JavaxMail




`Functionalities`  	: Some functionalities as follows:


                                                  
                                                  
		1: Multi-role Registration, Login, information management 


		2: Those companies as suppliers, can create, delete and update products/services


		3: Customers  could search for the trip/stay as well as keep a record in their account  


		4: Administers can review all orders from various organizations, also analyze data based on various criteria


`Walk-Through with one of the User Cases`		: Let's say I am planing a trip from Boston to Vancouver for a delightful familiy visit. The first thing I would do is to go on to the '''Backpackers''', sign up an account:

![Main page](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/mp.png){:height="50%" width="50%"}
![Account](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/acc.png)

Then I would log in and then select the service I want (at this point, maybe book a flight first) from the main customer page:

![Customer Page](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/cp.png)

Search for the flight schedule by keywords, or none!

![Search Flight](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/sf.png)

Humm... AA327 seems going to Vancouver YVR airport, lets check the available seats and try to purchase a ticket!

![Flight Schedule](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/fs.png)

So now take a tour in out "Backpackers" app from the perspective of "the third party", American Airline! After my attempt of purchasing the flight ticket, American Airline would go to their "Work Request" Panel, and then approve/decline my purchase (I can be declined for many reasons: being a fraud(without IDs), under age of 18 etc.) After they approve it, I successfully purchased a flight ticket!

Ok, now I am wondering, maybe I should rent a car so that I can transport freely when I get to Vancouver. I can do that too! So I would just go back to my cutomer panel, go and try to rent a car! With a similar precedure as before, I can see the list of vehicle I can rent. Which one should I pick? Maybe a Jeep from Enterprise, whose cars inventory are available from the "third party" enterprise side too. (For the sake of arguement and later demonstrations, I just go ahead and rent bunch of vehicles, you can see from my customer orders panel:)

![enterprise cars](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/ec.png)

![Rental Car](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/rc.png)

![Rental History](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/rchist.png)

Again, from the "third party" perspective, the famous "Enterprise" car rental company will now process my rental applications:

![Enterprise](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/ent.png)
![work request](https://raw.githubusercontent.com/xuzhe0205/IOB_markovchain/master/assets/NormDomEigv.png)

Notice that since I can and did apply for rental using my gained credits, so as the Enterprise company processing my order, the region of '''Discount Application''' will lightened up and they will click the '''Generate New Price''' button for me.

![Enterprise Work Request Panel](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/entwr.png)

Now as I, as a customer (xuzhe0205), go check my rental cars orders, I can send the Enterprise company an order cancellation request if I think the car is too expensive (like Tesla :( ). Then I would just wait to see if they approve/decline my cancellation request.

![Rental Cancel](https://raw.githubusercontent.com/xuzhe0205/IOB_markovchain/master/assets/cancel.png)


So far we have seen two of the three parties that our app "Backpackers" serves, now let's take a tour from our side, the Backpackers' administrators! After our staff logs in, there are many portals they can go to: Airline, Train, Hotel and Rental Car. Since we only cover airline and rental cars in this user case example, so the administrator would go to Airline, and see if our order is there. Oh it is there! Ok, they he/she would send us an E-Ticket confirmation for our flight order:
(given the time contraints for this project, so far I just directly put the email login part for the administrator at the same place as the email composing section)

![Eticket](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/eticket.png)

Similarly, but uniquely, I have added additional feature for the Rental Car portal, in which it grants "Backpackers" administrators the opportunities to plot some charts to visualize the sales data based on different rental companies and different vehicles make, so they can do various data analysis, for example, to see what the trend of sales for the last period of time, and which rental company is better emerging. For example, as they click '''Analyze by Rental Car Made''', they can visualize the sales histogram by each vehicle Make. Obviously, Toyota is the most popular, and Mercedes Benz and Tesla are too expensive to be popular.

![Rental History](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/renthist.png)

![Sales Chart](https://raw.githubusercontent.com/xuzhe0205/Backpackers/master/assets/chart.png)



Fork files from my repository, and try out more functionalities and fun with hotel booking and train rides reservation as well!



