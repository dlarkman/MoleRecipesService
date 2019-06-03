insert into recipe (id, method, name) values (-1, 'put sugar on peaches', 'Peach Melba');

insert into ingredient (id,name) values (-1,'Sugar');
insert into ingredient (id,name) values (-2,'Peaches');

insert into recipe_ingredients (recipe_id,ingredients_id) values (-1,-1);
insert into recipe_ingredients (recipe_id,ingredients_id) values (-1,-2);

