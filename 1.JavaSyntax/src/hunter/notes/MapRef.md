
# MAP:
 Operation	                                    |   Method
------------------------------------------------+--------------------
 Get a set of all pairs	                        |   entrySet()
 Get a set of all keys	                        |   keySet()
 Get a set of all values	                    |   values()
 Add a pair	                                    |   put(key, value)
 Get the value for the specified key	        |   get(key)
 Check whether the specified key is present	    |   containsKey(key)
 Check whether the specified value is present   |   containsValue(value)
 Check whether the Map is empty	                |   isEmpty()
 Clear the Map	                                |   clear()
 Remove the value for the specified key	        |   remove(key)

[+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++]

# SET:
 Operation	                                    |   Method
------------------------------------------------+--------------------
 Add element(s)                                 |   add(), addAll()
 Remove element(s)	                            |   remove(), removeAll()
 Check for the presence of element(s)	        |   contains(), containsAll()


/*
EXAMPLE:
    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        for ( Integer number : set ) {
            if (number >= 10) {
                set.remove(number);
            }
        }
        return set;
    }

// You cannot remove items from a set in a foreach loop. It will screw up the internal order and you end up
// with a ConcurrentModificationException and subsequent crash. You need to create an Iterator:

    Iterator<Integer> itr = *Set*.Iterator();

// ***Notice that Set is capitalized, that is because you can use this with any set type
// (HashSets, LinkedHashSet, TreeSet) as well as Maps and Lists. Make sure that you do not type 'Set' like above,
// but the actual variable that is of Set (or other) type.***

// Inside the angle bracket needs to be the same base type as the set (or other) that you are going to iterate through,
// in this case Integer. You can name it anything, i used itr, short for iterator. Then set it equal to the Iterator()
// method of the set you want to iterate through.

// Then to iterate you use a while loop and call itr.hasNext() (which returns true if there are still values
// left to iterate through, or false otherwise). Then you can call itr.next() to pull the next value,
// check if is greater than 10, and remove it SAFELY with itr.remove();

    ``` Java
    while(itr.hasNext())
       if(itr.next() >= 10)
          itr.remove();
    ```

 */
 
 