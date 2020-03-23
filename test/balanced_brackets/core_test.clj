(ns balanced-brackets.core-test
  (:require [clojure.test :refer :all]
            [balanced-brackets.core :refer :all]))

(deftest simple-bracket-match
  (is (= true (balanced? "()"))))

(deftest layered-simple-bracket-match
  (is (= true (balanced? "((()))"))))

(deftest complex-bracket-match
  (is (= true (balanced? "()(())((()))((()))"))))

(deftest simple-unbalanced-bracket-match
  (is (= false (balanced? ")(()"))))

(deftest simple-unbalanced-bracket-match
  (is (= false (balanced? "())()"))))

(deftest complex-unbalanced-bracket-match
  (is (= false (balanced? "(())())(()"))))