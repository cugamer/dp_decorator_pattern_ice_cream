Cold Slab Creamery Ice Cream decorator pattern
==============================================

A simple implementation of the decorator pattern as applied to an ice cream shop.  
Everything inherits from the "Ingredient" class, concrete components (the ice creams)
inherit directly from Ingredient.  There is also a decorator class "Mixin" which 
inherits from Ingredient, concrete decorators (the mixins) inherit from this.  This
is basic practice with the decorator pattern.


