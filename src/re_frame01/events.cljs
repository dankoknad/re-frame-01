(ns re-frame01.events
  (:require
   [re-frame.core :as re-frame]
   [re-frame01.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
