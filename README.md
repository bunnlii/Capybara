## **API Endpoints:**

#**view all capybaras:**
>http://localhost:8080/capybara/all

#**view capybara by id: {id} = capybaraId**
>http://localhost:8080/capybara/{id}

#**create new capybara: example : {enter info}**
>{
>    "name": "Jeffery",
>    "description": "A fun capybara, who also likes strawberries.",
>    "age": 4
>}
>http://localhost:8080/capybara/new
>{enter info} in body, raw, make sure it is on post

![image](https://github.com/user-attachments/assets/de2fd18c-69e1-4a8f-80e5-2884902dd2a6)

#**update capybara: {id} = capybaraId**
>http://localhost:8080/capybara/update/{id}
>{enter info} in body, raw, make sure it is on put, (make sure to include id in this one as the previous create created id on its own)
![image](https://github.com/user-attachments/assets/39dd76a5-c03d-44ff-aaa7-6aee9fd7ed7b)

#**delete capybara: {id} = capybaraId**
>http://localhost:8080/capybara/delete/{id}
>make sure it is on delete

#**Search capybara by age:**
>http://localhost:8080/capybara/{enter age}

#**Search capybara by name:**
>http://localhost:8080/capybara/name?search={enter name}
