# REST API for the protonic demonstrator

-----

| ------ | --------------------------------------- | 
| Authors| Umaj 					| 
| Date   | 03.09.2015                         |  

-----

The following document describes the Matching Service REST API for the platonic demonstrator. 

## Objects


### personObject

A *person* object is a JSON-Object. 


| property | type | required |comment |
| ----- | ----- | ----------- |----------- |
| id | string| required | id from the database| 

...

 


## GET /profile?userID=1234

__Request Header__

nothing special

__Request Body__
(empty)

__Response Body Example__ 


    {
    	"id": "1234",
    	"givenName": "Alexey",
    	"familyName": "Andreyev",
    	"nationality": "rus",
    	"popularity": "high",
    	"experience": "expert",
    	"email": "hello@hello.de",
    	"phone":09876542,
    	"projects": [
        	{
            	"title": "name"
        	}
    	],
   	 	"workplaces": [
   	     	{
   	         	"title": "name"
        	}
    	],
    	"organization": [
        	{
   	         	"title": "name"
        	}
    	],
    	"topicInterests": [
        	{
   	         	"title": "name"
        	}
    	],
    	"location": [
        	{
            	"title": "name"
        	}
    	],
    	"publications": [
        	{
           	 	"id": "82c90f2e-deac-4fa4-80f4-d077edacc2dc",
            	"title": "ordinary crime",
            	"abstract": "dkjfhsdlijfhdslkfjhsdfkj"
        	},
        	{
            	"id": "0f0c2b89-6dae-4f60-90f8-df49d96b9af9",
            	"title": "ordinary crime",
            	"abstract": "dkjfhsdlijfhdslkfjhsdfkj"
        	}
    	],
    	"knows": [
        	{

        	}
    	]
	}


## GET /match?userID=1234&location=34.2,67.8&amount=10

__Request Header__

nothing special

__Request Body__
(empty)


__Response Body Example__ 

	{
    "hits": 2,
    "results": [
        {
            "id": "5678",
            "givenName": "Janine",
            "familyName": "Hellriegel",
            "nationality": "deu",
            "popularity": "high",
            "experience": "expert",
            "email": "hello@hello.de",
            "phone": 309876542,
            "projects": [
                {
                    "title": "name"
                }
            ],
            "workplaces": [
                {
                    "title": "name"
                }
            ],
            "organization": [
                {
                    "title": "name"
                }
            ],
            "topicInterests": [
                {
                    "title": "name"
                }
            ],
            "location": [
                {
                    "title": "name"
                }
            ],
            "publications": [
                {
                    "id": "82c90f2e-deac-4fa4-80f4-d077edacc2dc",
                    "title": "ordinary crime",
                    "abstract": "dkjfhsdlijfhdslkfjhsdfkj"
                },
                {
                    "id": "0f0c2b89-6dae-4f60-90f8-df49d96b9af9",
                    "title": "ordinary crime",
                    "abstract": "dkjfhsdlijfhdslkfjhsdfkj"
                }
            ],
            "knows": [
                {
                    "id": "9101",
                    "givenName": "Umutcan",
                    "familyName": "Şimşek"
                }
            ]
        },
        {
            "id": "9101",
            "givenName": "Umutcan",
            "familyName": "Şimşek",
            "nationality": "deu",
            "popularity": "high",
            "experience": "expert",
            "email": "hello@hello.de",
            "phone": 309876542,
            "projects": [
                {
                    "title": "name"
                }
            ],
            "workplaces": [
                {
                    "title": "name"
                }
            ],
            "organization": [
                {
                    "title": "name"
                }
            ],
            "topicInterests": [
                {
                    "title": "name"
                }
            ],
            "location": [
                {
                    "title": "name"
                }
            ],
            "publications": [
                {
                    "id": "82c90f2e-deac-4fa4-80f4-d077edacc2dc",
                    "title": "ordinary crime",
                    "abstract": "dkjfhsdlijfhdslkfjhsdfkj"
                },
                {
                    "id": "0f0c2b89-6dae-4f60-90f8-df49d96b9af9",
                    "title": "ordinary crime",
                    "abstract": "dkjfhsdlijfhdslkfjhsdfkj"
                }
            ],
            "knows": [
                {
                    "id": "5678",
                    "givenName": "Janine",
                    "familyName": "Hellriegel"
                }
            ]
        }
    ]
	}
	





## POST /rating?userID=1234

__Request Header__

nothing special


__Request Body__

	{
		"personID": 5678,
		"platonic":"Yes"
	}

__Response Body__
(empty)