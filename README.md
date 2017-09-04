# Spring-Boot

This section describes how can we create a robot, perform any operation with robot and get list of all the robots.

1. To create a robot : 

hit a rest call to - http://{{server_name}}:8080/robot/

Request Type : PUT
Request body (In JSON): 



{
	"robotId" : 1,
	"robotName" : "Robot 1",
	"maxWeight" : 5,
	"maxDistance" : 10,
	"maxBatteryStatus" : 100,
	"remainingBatteryPercentage" : 100,
	"batteryPerKg" : 2
}

Note : Chnage the request body accordingly..

2. To get the list of all the robots : 

hit a rest call to - http://{{server_name}}:8080/robot/
Request Type : GET


3. To perform any operation with robot :

hit a rest call to : http://{{server_name}}:8080/robot/perform

Request Type : PUT 

Request Body (in JSON) :

{
	"robotId" : 1,
	"distance" : 3 ,
	"weight" : 4
}

NOTE : chnage the body accordingly..
