---
title: Prototype
category: Creational
language: en
tag: 
 - Gang Of Four
 - Instantiation
---

## Intent

Specify the kinds of objects to create using a prototypical instance, and create new objects by 
copying this prototype.

## Explanation

First, it should be noted that the Prototype pattern is not used to gain performance benefits. It's only 
used for creating new objects from prototype instances.

Real-world example

> Remember Dolly? The sheep that was cloned! Let's not get into the details but the key point here is 
> that it is all about cloning.

In plain words

> Create an object based on an existing object through cloning.

Wikipedia says

> The prototype pattern is a creational design pattern in software development. It is used when the 
> type of objects to create is determined by a prototypical instance, which is cloned to produce new 
> objects.

In short, it allows you to create a copy of an existing object and modify it to your needs, instead 
of going through the trouble of creating an object from scratch and setting it up.



## Applicability

Use the Prototype pattern when a system should be independent of how its products are created, 
composed, represented and

* When the classes to instantiate are specified at run-time, for example, by dynamic loading.
* To avoid building a class hierarchy of factories that parallels the class hierarchy of products.
* When instances of a class can have one of only a few different combinations of state. It may be 
more convenient to install a corresponding number of prototypes and clone them rather than 
instantiating the class manually, each time with the appropriate state.
* When object creation is expensive compared to cloning.

##Current Project


#Custom Meal Planning Service:
Imagine a company that offers personalized meal planning services, allowing customers to create customized meal plans based on their dietary preferences, nutritional needs, and lifestyle choices.
#Prototype Design Pattern Implementation:
The Prototype design pattern can be employed to create prototype objects representing different types of meal plans, such as vegetarian, vegan, ketogenic, gluten-free, and low-carb.
Each prototype object contains the basic structure and components of its respective meal plan type, including recipes, ingredient lists, portion sizes, and nutritional information.
#Customization Process:
When a customer subscribes to the meal planning service, they select their preferred meal plan type, such as a vegetarian meal plan.
The system creates a clone of the corresponding prototype object representing the selected meal plan type.
The cloned object serves as a base template that the customer can customize according to their dietary preferences and nutritional requirements, such as swapping out recipes, adjusting portion sizes, or excluding specific ingredients.
The customization process modifies the cloned object's properties and configuration to reflect the customer's dietary choices while preserving the original prototype object.
#Benefits of Using Prototype Pattern:
Efficient Customization: By using prototypes, the system streamlines the customization process by providing pre-defined templates for different meal plan types. Customers can easily customize their meal plans without starting from scratch.
Flexibility and Variety: The Prototype pattern offers a wide range of customization options, allowing customers to tailor their meal plans to suit their dietary restrictions, food preferences, and nutritional goals.
Consistency in Planning: Since each customized meal plan is based on a cloned prototype object, there is consistency in meal structure, ingredient choices, and nutritional balance across all plans. Any updates or modifications to the base prototypes apply to all customized meal plans.
#Scalability and Expansion:
The Prototype pattern facilitates scalability and expansion of the meal planning service. New meal plan types, recipes, dietary options, and customization features can be added by creating additional prototype objects, which can then be cloned and customized like existing ones.
As the service grows, the system can efficiently handle a variety of dietary preferences and nutritional requirements while maintaining performance and scalability.

## Known uses

* [java.lang.Object#clone()](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone%28%29)

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/gp/product/0201633612/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=0201633612&linkCode=as2&tag=javadesignpat-20&linkId=675d49790ce11db99d90bde47f1aeb59)
* [Head First Design Patterns: A Brain-Friendly Guide](https://www.amazon.com/gp/product/0596007124/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=0596007124&linkCode=as2&tag=javadesignpat-20&linkId=6b8b6eea86021af6c8e3cd3fc382cb5b)