Amplitude.init({
    songs: [
        {
            name: 'In a Silent Way', 
            artist: 'gogorgut',
            album: 'to be kind (2014)',
            url: './music/song1.mp3', 
            cover_art_url: './music/cover1.jpg'
        },
        {
            name: 'Still life', 
            artist: 'gogorgut',
            album: 'Cody (1999)',
            url: './music/song2.mp3', 
            cover_art_url: './music/cover2.jpg'
        },
        {
            name: 'Bleak', 
            artist: 'gogorgut',
            album: 'Black Water Park (2001)',
            url: './music/song3.ogg', 
            cover_art_url: './music/cover3.jpg'
        },
    ]
})

Amplitude.bindNewElements();

document.addEventListener('amplitude-song-loaded', function(event) {
  document.querySelector('.amplitude-song-slider').max = event.detail.duration;
});

document.addEventListener('amplitude-time-update', function() {
    document.querySelector('.amplitude-song-slider').value = Amplitude.getSongPlayedSeconds();
  });
  