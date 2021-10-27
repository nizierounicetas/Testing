using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;

using MinApp;

namespace TestMinApp
{
    [TestClass]
    public class UnitTest1
    {

        private TestContext testContextInstance;
        ///Gets or sets the test context which provides
        ///information about and functionality for the current test run
        public TestContext TestContext
        {
            get
            {
                return testContextInstance;
            }
            set
            {
                testContextInstance = value;
            }
        }
        #region Additional test attributes
        //
        // You can use the following additional attributes as you write your tests:
        //
        // Use ClassInitialize to run code before running the first test in the class
        // [ClassInitialize()]
        // public static void MyClassInitialize(TestContext testContext) { }
        //
        // Use ClassCleanup to run code after all tests in a class have run
        // [ClassCleanup()]
        // public static void MyClassCleanup() { }
        //
        // Use TestInitialize to run code before running each test
        // [TestInitialize()]
        // public void MyTestInitialize() { }
        //
        // Use TestCleanup to run code after each test has run
        // [TestCleanup()]
        // public void MyTestCleanup() { }
        //
        #endregion

        [TestMethod]
        public void TestMin1()
        {
            int min;
            min = Program.Min(3, 4, 5);
            Assert.AreEqual(3, min);
        }

        [TestMethod]
        public void TestMin2()
        {
            int min;
            min = Program.Min(10, 3, -3);
            Assert.AreEqual(-3, min);
        }

        [TestMethod]
        public void TestMin3()
        {
            int min;
            min = Program.Min(10, 2+1, 5);
            Assert.AreEqual(3, min);
        }
    }

}
