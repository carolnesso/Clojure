(ns aula.aula2)

(defn criar-transacao
  [nome valor]
  {:nome nome :valor valor})

(def transacoes
  [
   (criar-transacao "venda" 12.99)
   (criar-transacao "venda" 123.45)
   (criar-transacao "compra" -100)
   (criar-transacao "compra" -1.99)
   ])

(defn add-transacao
  [transacoes-real nova-transacao]
  (conj transacoes-real nova-transacao))