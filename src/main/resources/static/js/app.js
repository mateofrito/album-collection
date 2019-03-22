import '../css/styling.css'

// import events from './utils/events/event-action'
import api from './utils/api/api-action'
import Artists from './components/Artists'

main()

function main() {
  api.getRequest('/artists', artists => {
    getAppContext().innerHTML = Artists(artists);
  })
}

function getAppContext() {
  return document.querySelector("#app")
}