(ns balanced-brackets.core)

; (pop-or-push \( [\(])
; [\( \(]
; (pop-or-push \( [\)])
; []
(defn- pop-or-push
  [item stack]
  (if (= item \()
    (conj stack item)
    (if (= (peek stack) \()
      (pop stack)
      (conj stack item))))

; (defn- bracket-match
;   [s]
;   (loop [val s
;          stack []]
;     (if-let [i (first val)]
;       (recur (rest val) (pop-or-push i stack))
;       stack)))

(defn balanced?
  "balanced? returns true if given string of brackets '(())' is balanced"
  [s]
  (empty? (loop [val s stack []]
            (if-let [i (first val)]
              (recur (rest val) (pop-or-push i stack))
              stack))))
