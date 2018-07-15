Try this app online: [https://guidosalva.github.io/REScala/projects/todolist/]

# REScala • [TodoMVC](http://todomvc.com)

> 
> REScala is a Scala library for functional reactive programming on the JVM and
> the Web. It provides a rich API for event stream transformations and signal
> composition with managed consistent up-to-date state and minimal syntactic
> overhead. It supports concurrent and distributed programs.

## Resources

- [Website](https://guidosalva.github.io/REScala/)
- [Manual](https://guidosalva.github.io/REScala/manual/)
- [Scaladoc](https://guidosalva.github.io/REScala/scaladoc/rescala/index.html)
- [Publications](https://guidosalva.github.io/REScala/Publications.html)
- [Github](https://github.com/guidosalva/REScala/)
- [Todolist Github](https://github.com/guidosalva/REScala/tree/master/Examples/Todolist)

## Implementation

We implemented most of the TodoMVC specification.
Especially interesting is the use of reactive signals to generate html-elements,
which update automatically with the sync, and the ability to persist state into
localStorage automatically, by saving all signals values.

 *  New todos are entered in top input, which is autofocused.
    Enter clears input, input is trimmed, and empty todos are not allowed.
 *  Hide footer when there are no todos.
 *  Mark-all button makes toggles every todos done state.
 *  Clicking todo checkbox toggles their done state.
 *  Double clicking a todo label turns it into editing mode.
    Editing hides checkbox and deletion button.
    blur and enter end editing.
 *  On changes, input is trimmed. Empty todos shall be deleted.
 *  Deletion button is shown on hovering over todos.
 *  Todo counter is pluralized correctly: 0 item**s**, 1 item, 2 item**s**, ... .
 *  The clear-completed button is only visible when there are todos.
 *  Todo state persists using localStorage over consecutive page visits.

We have not implemented the following things:

 *  To integrate seamlessly into scala development, we use sbt for dependency
    management instead of npm.
 *  If all todos get marked done, the Mark-done button should show this.
 *  Double clicking focused the editing input.
 *  We have not implemented routing and the related todo filters.
 *  Escaping the input shall cancel editing, restore previous value.

Tested with Firefox 61 and Chrome 66.

## Running

You need to install sbt beforehand. Last tested using sbt 1.1.6.
Sbt will then download the correct versions of scala, rescala, rescalatags
and their dependencies, see build.sbt for required versions.

Run with:

~~~
$ sbt fastOptJS           # get scala dependencies and compile scala to js
$ firefox index.html      # open todomvc    in browser
~~~

Note that opening index.html does not work, because Chrome blocks access to LocalStorage for file:// URLs. 

If you upgrade to another scala version, you must update in index.html the script src to the new version. like this: "./target/scala-VERSION/daimpl-fastopt.js"

## Credit

See https://guidosalva.github.io/REScala/contact.html#contributions

