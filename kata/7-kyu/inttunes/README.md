# [IntTunes](https://www.codewars.com/kata/inttunes "https://www.codewars.com/kata/5b8dc84b8ce20454bd00002e")

<p> <i>This section does not need to be read and can be skipped, but it does provide some clarity into the inspiration behind the problem.</i></p>

<p>In music theory, <a href = "https://en.wikipedia.org/wiki/Major_scale">a major scale</a> consists of seven notes, or <a href = "https://en.wikipedia.org/wiki/Degree_(music)">scale degrees</a>, in order (with tonic listed twice for demonstrative purposes):</p>

<ol>
  <li>Tonic, the base of the scale and the note the scale is named after (for example, C is the tonic note of the C major scale)</li>
  <li>Supertonic, 2 semitones (or one tone) above the tonic</li>
  <li>Mediant, 2 semitones above the supertonic and 4 above the tonic</li>
  <li>Subdominant, 1 semitone above the median and 5 above the tonic</li>
  <li>Dominant, 2 semitones above the subdominant and 7 above the tonic</li>
  <li>Submediant, 2 semitones above the dominant and 9 above the tonic</li>
  <li>Leading tone, 2 semitones above the mediant and 11 above the tonic</li>
  <li value = 1>Tonic (again!), 1 semitone above the leading tone and 12 semitones (or one octave) above the tonic
</ol>

<p>An <a href = "https://en.wikipedia.org/wiki/Octave">octave</a> is an <a href = "https://en.wikipedia.org/wiki/Interval_(music)">interval</a> of 12 semitones, and the <a href = "https://en.wikipedia.org/wiki/Pitch_class">pitch class</a> of a note consists of any note that is some integer
number of octaves apart from that note. Notes in the same pitch class sound different but share similar properties. If a note is in a major scale, then any note in that note's pitch class is also in that major scale.

<h1><u> Problem  </u></h1>

<p>Using integers to represent notes, the <b>major scale</b> of an integer <code>note</code> will be an array (or list) of integers that follows the major scale pattern <code>note</code>, <code>note + 2</code>, <code>note + 4</code>, <code>note + 5</code>, <code>note + 7</code>, <code>note + 9</code>, <code>note + 11</code>. For example, the array of integers <code>[1, 3, 5, 6, 8, 10, 12]</code> is the major scale of  <code>1</code>.</p>

<p>Secondly, the <b>pitch class</b> of a note will be the set of all integers some multiple of 12 above or below the note. For example, <code>1</code>, <code>13</code>, and <code>25</code> are all in the same pitch class.</p>

<p>Thirdly, an integer <code>note1</code> is considered to be <b>in the key of</b> an integer <code>note2</code> if <code>note1</code>, or some integer in <code>note1</code>'s pitch class, is in the <b>major scale</b> of <code>note2</code>.  More mathematically, an integer <code>note1</code> is <b>in the key of</b> an integer <code>note2</code> if there exists an integer <code>i</code> such that <code>note1 + i &times; 12</code> is in the <b>major scale</b> of <code>note2</code>. For example, <code>22</code> is <b>in the key of</b> of 1 because, even though <code>22</code> is not in 1's major scale (<code>[1, 3, 5, 6, 8, 10, 12]</code>), <code>10</code> is and is also a multiple of 12 away from <code>22</code>. Likewise, <code>-21</code> is also <b>in the key of</b> <code>1</code> because <code>-21 + (2 &times; 12) = 3</code> and <code>3</code> is present in the <b>major scale</b> of 1. An array is in the key of an integer if all its elements are in the key of the integer.

<p>Your job is to create a function <code>is_tune</code> that will return whether or not an array (or list) of integers is a <b>tune</b>. An array will be considered a <b>tune</b> if there exists a single integer <code>note</code> all the integers in the array are <b>in the key of</b>. The function will accept an array of integers as its parameter and return <code>True</code> if the array is a <b>tune</b> or <code>False</code> otherwise. Empty and null arrays are not considered to be tunes. Additionally, the function should not change the input array.</p>

<h1><u> Examples </u></h1>

```
is_tune([1, 3, 6, 8, 10, 12]) # Returns True, all the elements are in the major scale  
    # of 1 ([1, 3, 5, 6, 8, 10, 12]) and so are in the key of 1.
is_tune([1, 3, 6, 8, 10, 12, 13, 15]) # Returns True, 14 and 15 are also in the key of 1 as 
    # they are in the major scale of 13 which is in the pitch class of 1 (13 = 1 + 12 * 1).
is_tune([1, 6, 3]) # Returns True, arrays don't need to be sorted.
is_tune([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) # Returns False, this array is not in the 
    # key of any integer.
is_tune([2, 4, 7, 9, 11, 13]) # Returns True, the array is in the key of 2 (the arrays
    #  don't need to be in the key of 1, just some integer)
```