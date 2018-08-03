(ns clj-http-server.constants)

(def clrf "\r\n")

(def response-reasons {200 "OK"
                       204 "No Content"
                       404 "Not Found"})

(def content-types {".txt"  "text/plain"
                    ".html" "text/html"
                    ".png"  "image/png"
                    ".gif"  "image/gif"
                    ".jpeg" "image/jpeg"})
