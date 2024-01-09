# TaskManagerAPI
Creating a Task Manager API using java and springBoot

# SETUP:
generated a Maven File from spring intializer.
developed on intelliJ idea
divided the folders into controller,Model,repository,service,and the main RestDemoApplication from where the application runs on the server end
TaskManagerController.java class handles the logic for each CRUD endpoint, i.e. what to do when the endpoint is hit
the TaskManager model class stores the table schema and all the attributes with it
taskManager service class handles the routing to all the endpoints like create,update,delete,get,getAll

the database is connected in the application.yaml file and all the endpoints when hit perform the logic and store the data in the mysql db
