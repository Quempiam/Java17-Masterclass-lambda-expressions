# Java17 Masterclass - lambda expressions

## Exercise:
- Create an array of *String* populated with first names in mixed case
- Include at least one name, which is spelled the same backward and forwards
- Use *Arrays.setAll* or *List.replaceAll* to change its values as written below
- If you use list, you'll need an array-backed list to change values of initial array

With the array set up, do the following using lambda expressions
- Transform names to uppercase
- Add randomly generated Middle initial with dot
- Add last name that is the reverse of first name

Print Array after each change using *foreach* method

Create new *ArrayList* from prepared array, removing any names where 
the first name equals the last name. Use *removeIf* to do it.

For now don't use method references.