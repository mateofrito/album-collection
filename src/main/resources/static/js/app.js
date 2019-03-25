import '../css/styling.css'

import events from './utils/events/event-action'
import api from './utils/api/api-action'
import Artists from './components/Artists'

main()

function main() {
  api.getRequest('/artists', artists => {
    getAppContext().innerHTML = Artists(artists);
  })
  events.on(getAppContext(), 'click', () => {
    if(event.target.classList.contains('add-artist__submit')){
      const artistName = document.querySelector('.add-artist__artistName').value
      const artistImage = document.querySelector('.add-artist__artistImage').value
      const artistRating = document.querySelector('.add-artist__artistRating').value

      api.postRequest('/artists/add', {
        artistName:artistName,
        artistImage:artistImage,
        artistRating:artistRating
      }, (artists) => getAppContext().innerHTML= Artists(artists))
    }
  })
}

function getAppContext() {
  return document.querySelector("#app")
}