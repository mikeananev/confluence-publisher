(ns confluence-publisher.confluence-publisher.core
  (:gen-class)
  (:import (org.sahli.asciidoc.confluence.publisher.cli AsciidocConfluencePublisherCommandLineClient)))

(defn -main
  "entry point to app."
  [& args]
  (AsciidocConfluencePublisherCommandLineClient/main (into-array String args))
  (System/exit 0))
