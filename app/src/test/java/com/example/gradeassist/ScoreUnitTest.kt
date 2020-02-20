package com.example.gradeassist



//import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.example.gradeassist.dto.Score
import com.example.gradeassist.service.IScoreService
// import app.plantdiary.individualassignment3048q.ui.main.MainViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.rules.TestRule

class ScoreUnitTest {

    // ------------------------------
    // TESTS
    // ------------------------------

    @Test
    fun scoreDTO_maintainsState() {
        var score = Score(1000)
        assertTrue(score.scoreId.equals(1000) )
    }

    // ------------------------------
    // GIVEN
    // ------------------------------

    // ------------------------------
    // WHEN
    // ------------------------------

    // ------------------------------
    // THEN
    // ------------------------------

}


//
//class CountryUnitTest {
//
//    @get:Rule
//    var rule: TestRule = InstantTaskExecutorRule()
//    lateinit var mvm: MainViewModel
//
//    @Before
//    fun populateCountries() {
//        mvm = MainViewModel()
//    }
//
//
//    @Test
//    fun countryDTO_isPopulated() {
//        givenViewModelIsInitialized()
//        whenJSONDataAreReadAndParsed()
//        thenTheCollectionSizeShouldBeGreaterThanZero()
//    }
//
//    private fun givenViewModelIsInitialized() {
//
//    }
//
//    private fun whenJSONDataAreReadAndParsed() {
//        mvm.fetchCountries()
//    }
//
//    private fun thenTheCollectionSizeShouldBeGreaterThanZero() {
//        mvm.countries.observeForever{
//            assertNotNull(it)
//            assertTrue(it.size > 0)
//        }
//    }
//
//
//    @Test
//    fun countryDTO_containsBelize() {
//        givenViewModelIsInitialized()
//        whenJSONDataAreReadAndParsed()
//        thenResultsShouldContainBelize()
//    }
//
//    private fun thenResultsShouldContainBelize() {
//        var containsBelize:Boolean = false
//        mvm.countries.observeForever {
//            it.forEach {
//                if (it.name.equals("Belize")) {
//                    containsBelize = true
//                }
//            }
//            assertTrue(containsBelize)
//        }    }
//}
