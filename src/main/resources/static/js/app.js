import '../css/styling.css'

import events from './utils/events/event-action'
import api from './utils/api/api-action'
import Artists from './components/Artists'

main()

function main() {
  api.getRequest('/artists', artists => {
    console.log(artists)
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

  events.on(getAppContext(), 'click', ()=>{
    if(event.target.classList.contains('add-album__submit')){
      const albumTitle = document.querySelector('.add-album__albumTitle').value
      const albumCover = document.querySelector('.add-album__albumCover').value
      const albumRating = document.querySelector('.add-album__albumRating').value
      const artist = document.querySelector('.add-album__artist').value

      api.postRequest('/albums/add', {
        albumTitle:albumTitle,
        albumCover:albumCover,
        albumRating:albumRating,
        artist:artist
      }, (artists) => getAppContext().innerHTML= Artists(artists))
    }
  })

  events.on(getAppContext(), 'click', ()=>{
    if(event.target.classList.contains('add-song__submit')){
      const songTitle = document.querySelector('.add-song__songTitle').value
      const album = document.querySelector('.add-song__album').value
      const duration = document.querySelector('.add-song__duration').value
      const songRating = document.querySelector('.add-song__songRating').value

      api.postRequest('/songs/add', {
        songTitle:songTitle,
        album:album,
        duration:duration,
        songRating:songRating,
        }, (artists) => getAppContext().innerHTML= Artists(artists))
    }
  })
}

function getAppContext() {
  return document.querySelector("#app")
}
