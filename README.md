# balanced-brackets

Naive stack-based library to find bracket "(" ")" balanced match.
It's a toy for me to explore a simplest Clojure stack-based function to determine if a given brackets in string is balanced.

## Usage

```clojure
balanced-brackets.core=> (require '[balanced-brackets.core :as b] :reload-all)

(b/balanced? "()")
true

(b/balanced? "(()")
false

(b/balanced? ")(())(")
false

(b/balanced? "()()(())((()))")
true

```

