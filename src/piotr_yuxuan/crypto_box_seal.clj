(ns piotr-yuxuan.crypto-box-seal
  (:require [tech.v3.jna :as jna]))

(jna/load-library "sodium")

(jna/find-function "crypto_box_seal" "sodium")

;; int crypto_box_seal(unsigned char *c,
;;                     const unsigned char *m,
;;                     unsigned long long mlen,
;;                     const unsigned char *pk);

(def secret-key "secret-key")
(def secret-value "secret-value")

(jna/string->ptr "asd")
(jna/malloc "")

(jna/def-jna-fn "sodium" crypto_box_seal
                "Encrypt secret in a box"
                Integer
                [data identity]     ;;Each argument has a coercer-fn. Pointers can be lots of types.
                [mlen int]         ;;read docs for memset
                [n-bytes unchecked])

jna/si
